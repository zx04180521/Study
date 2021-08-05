package org.Demo_TZ;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

//创建一个类，继承自HttpServlet(Servlet.jar提供的类)这样的父类
//重写doXXX 方法（doGet/doPost/doPut/doDelete...）

@WebServlet("/hello1")
public class HelloServlet_TZ extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //先写一个简单的HelloServlet
        //请求无论是啥，相应都返回 HelloServlet_TZ
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");

        Writer writer=resp.getWriter();
        writer.write("<h1>Hello Servlet</h1>");//把一个字符串写到HTTP相应的body中
        String str1="张鑫";
        String str2="123";
        int a=0;
        writer.write(str1);
        writer.write("<br>");
        writer.write(str2);
        writer.write("<br>");
        writer.write(""+a);
    }

}

