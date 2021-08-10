package api;

import model.User;
import model.UserDao;
import view.HtmlGenerator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        //1.先获取到前端提交的数据（用户名，密码），校验是否合法
        String name=req.getParameter("name");
        String password=req.getParameter("password");
        if(name==null||"".equals(name)
                ||password==null||"".equals(password)){
            //用户提交的数据有误
            //返回一个错误页面，（一段字符串，html构成得到）
            String html= HtmlGenerator.getMessagePage("用户名或者密码为空",
                    "register.html");//第一个参数为错误页面提示信息，第二个参数为接下来要跳转的页面
            Writer writer=resp.getWriter();
            writer.write(html);
            return;
        }

        //2.拿着用户名，在数据库中查看，看当前用户名是否存在，如果存在，认为注册失败（用户名不能重复）
        UserDao userDao=new UserDao();
        User exitUser=userDao.selectByName(name);
        if(exitUser!=null){
            //exitUser非空，表示用户名已经存在，就提示用户，注册失败，用户名重复
            String html=HtmlGenerator.getMessagePage("用户名重复！请换个名字！",
                    "register.html");
            Writer writer=resp.getWriter();
            writer.write(html);
            return;
        }
        //3.根据用户前端提交的数据构造User对象，并插入到数据库中
        User user=new User();
        user.setName(name);
        user.setPassword(password);
        userDao.add(user);
        //4.返回一个结果页面，提示当前注册成功
        String html= HtmlGenerator.getMessagePage("注册成功！点击跳转登录页面","login.html");
        Writer writer=resp.getWriter();
        writer.write(html);
        return;
    }
}
