package api;

import Util.HttpUtil;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import problem.Problem;
import problem.ProblemDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/problem")
public class ProblemServlet extends HttpServlet {
    private Gson gson=new GsonBuilder().create();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //查询题目列表/详细信息
        req.setCharacterEncoding("utf-8");
        resp.setContentType("application/json;charset=utf-8");
        String id=req.getParameter("id");
        if(id==null||id.equals("")){
            //查找题目列表
            selectAll(resp);
        }else{
            //查看题目详情页面
            selectOne(Integer.parseInt(id),resp);
        }
    }

    private void selectOne(int parseInt, HttpServletResponse resp) throws IOException {
        //创建ProblemDAO对象
        ProblemDAO problemDAO=new ProblemDAO();
        //查找指定的结果
        Problem problem=problemDAO.selectOne(parseInt);
        //将结果包装成JSOn格式
        String respString=gson.toJson(problem);
        //将结果写回前端
        resp.getWriter().write(respString);
    }

    private void selectAll(HttpServletResponse resp) throws IOException {
        //创建ProblemDAO对象
        ProblemDAO problemDAO=new ProblemDAO();
        //查找所有结果
        List<Problem> problems=problemDAO.selectAll();
        //将结果包装成JSON格式
        String respString=gson.toJson(problems);
        //把结果写会前端
        resp.getWriter().write(respString);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //插入一个题目
        //1.读取到请求中的body信息
        //  进一步就可以插入数据库
        String body= HttpUtil.readBody(req);
        Problem problem=gson.fromJson(body,Problem.class);
        ProblemDAO problemDAO=new ProblemDAO();
        problemDAO.insert(problem);
        req.setCharacterEncoding("utf-8");
        resp.setContentType("application/json;charset=utf-8");
        resp.getWriter().write("{\"ok\":1}");
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("application/json;charset=utf-8");
        String id=req.getParameter("id");
        if(id==null||id.equals("")){
            resp.getWriter().write("{\"ok\":0,\"reason\":\"id不存在\"}");
            return;
        }
        ProblemDAO problemDAO=new ProblemDAO();
        problemDAO.delete(Integer.parseInt(id));
        resp.getWriter().write("{\"ok\":1}");
    }
}
