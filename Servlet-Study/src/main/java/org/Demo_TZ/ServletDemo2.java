package org.Demo_TZ;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

@WebServlet("/ServletDemo2")
public class ServletDemo2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       req.setCharacterEncoding("UTF-8");
       resp.setContentType("text/html;charset=utf-8");
       //处理表单提交数据
        String firstName=req.getParameter("firstName");
        String secondName=req.getParameter("secondName");
        Writer writer=resp.getWriter();
        writer.write("firstName:"+firstName);
        writer.write("<br>");
        writer.write("secondName"+secondName);
        int a=0;
        writer.write("a="+a);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
