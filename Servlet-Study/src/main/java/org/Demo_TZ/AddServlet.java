package org.Demo_TZ;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

@WebServlet("/add")
public class AddServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html");

        String a=req.getParameter("a");
        String b=req.getParameter("b");
        int add=Integer.parseInt(a)+Integer.parseInt(b);
        Writer writer=resp.getWriter();
        writer.write(String.format("<h1>add = %d</h1>", add));
        writer.write("<h2>"+add+"</h2>");
        writer.write("add:"+add);
        writer.write(""+add);
    }
}
