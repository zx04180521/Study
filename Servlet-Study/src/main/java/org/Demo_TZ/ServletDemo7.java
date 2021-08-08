package org.Demo_TZ;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

//演示服务器给浏览器写会 cookie
@WebServlet("/ServletDemo7")
public class ServletDemo7 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     //1.先构造cookie对象，每个 Cookie对象就是一个键值对
     Cookie userName=new Cookie("userName","zx");
     Cookie age=new Cookie("age","18");
     //2.把 Cookie放回响应中
        resp.addCookie(userName);
        resp.addCookie(age);

        //3.创建一个相应报文
        resp.setContentType("text/html;charset=utf-8");
        Writer writer=resp.getWriter();
        writer.write("返回 cookie 成功！");
    }
}
