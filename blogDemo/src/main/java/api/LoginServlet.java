package api;

import model.User;
import model.UserDao;
import view.HtmlGenerator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.Writer;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        //1.获取用户名密码，判断用户名密码是否合法
        String name=req.getParameter("name");
        String password=req.getParameter("password");
        if(name==null||"".equals(name)
                ||password==null||"".equals(password)){
            //用户提交的数据有误
            //返回一个错误页面，（一段字符串，html构成得到）
            String html= HtmlGenerator.getMessagePage("用户名或者密码为空",
                    "login.html");//第一个参数为错误页面提示信息，第二个参数为接下来要跳转的页面
            Writer writer=resp.getWriter();
            writer.write(html);
            return;
        }
        //2.查看该名字是否在数据库中存在
        // 3.对比密码是否匹配
        UserDao userDao=new UserDao();
        User user=userDao.selectByName(name);
        if(user==null||!user.getPassword().equals(password)){
            //表示不存在该用户名,提示错误
            String html= HtmlGenerator.getMessagePage("用户名或者密码错误",
                    "login.html");
            Writer writer=resp.getWriter();
            writer.write(html);
            return;
        }
        //4.匹配成功则认为登录成功，创建一个Session
        //   后序再访问服务器时，服务器就知道客户端是谁了
        HttpSession httpSession=req.getSession(true);
        httpSession.setAttribute("user",user);
        //返回登录成功页面
        String html=HtmlGenerator.getMessagePage("登录成功",
                "article");
        resp.getWriter().write(html);
    }
}
