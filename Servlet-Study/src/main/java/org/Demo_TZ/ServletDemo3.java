package org.Demo_TZ;

import org.example.servlet.HelloServlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;
import java.util.Enumeration;

@WebServlet("/ServletDemo3")
public class ServletDemo3 extends HelloServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        Enumeration<String> headerNames=req.getHeaderNames();
        Writer writer=resp.getWriter();
        writer.write("<html>");
        while(headerNames.hasMoreElements()){
            String header=headerNames.nextElement();
            writer.write(header+":"+req.getHeader(header));
            writer.write("<br>");
        }
        writer.write("</html>");
    }
}
