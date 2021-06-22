package api;

import Util.HttpUtil;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import compile.Answer;
import compile.Question;
import compile.Task;
import problem.Problem;
import problem.ProblemDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/compile")
public class CompileServlet extends HttpServlet {
    private Gson gson=new GsonBuilder().create();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.先从请求中读取body信息
        String body= HttpUtil.readBody(req);
        //2.把这个json数据转换成请求对象
        CompileRequest compileRequest=gson.fromJson(body,CompileRequest.class);
        //3.根据数据中的id获取数据库中测试用例代码
        ProblemDAO problemDAO=new ProblemDAO();
        Problem problem=problemDAO.selectOne(compileRequest.getId());
        //testCode 就是当前这个题目的测试代码
        String testCode=problem.getTestCode();
        //4.把这个用户提交的代码和测试代码拼接在一起。拼接成一个完整的代码
        //  requestCode就表示用户提交的代码
        //  finalCode就表示测试代码
        String requestCode=compileRequest.getCode();
        String finalCode=merge(requestCode,testCode);
        //5.创建task对象，借助Task对象完成编译运行这个代码
        Task task=new Task();
        Question question=new Question();
        question.setCode(finalCode);
        Answer answer=null;
        try {
            answer=task.compileAndRun(question);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //把这个运行结果包装成相应数据，吧数据返回给页面即可
        CompileResponse compileResponse=new CompileResponse();
        compileResponse.setError(answer.getError());
        compileResponse.setReason(answer.getReason());
        compileResponse.setStdout(answer.getStdout());
        String respString=gson.toJson(compileResponse);
        resp.setContentType("application/json;charset=utf-8");
        resp.getWriter().write(respString);
    }
    private String merge(String requestCode,String testCode){
        //先找到requestCode末尾的 } ，并截取出前面的代码
        int pos=requestCode.lastIndexOf("}");
        if(pos==-1){
            return null;
        }
        //2.把testCode拼接到后面再拼接上 } 即可
        return requestCode.substring(0,pos)+testCode+"}";
    }
}
