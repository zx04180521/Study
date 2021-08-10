package org.example.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html");

        //解析请求：header，method，url，请求数据
        //通过键获取值，如果该键没有值，返回null
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        PrintWriter pw = resp.getWriter();

        //数据库根据客户端用户输入的账号密码，查询有没有该数据
        //简单的模拟
        if("abc".equals(username) && "123".equals(password)){
            pw.println("<h1>欢迎你："+username+"</h1>");
        }else {
            pw.println("<h1>用户名密码错误</h1>");
        }
    }
}
