package ServletTest;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

public class CalcServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String str1=req.getParameter("a");
        String str2=req.getParameter("b");
        int a=Integer.parseInt(str1);
        int b=Integer.parseInt(str2);
        int result = a + b;
        Writer writer=resp.getWriter();
        writer.write(String.format("<h1>result = %d</h1>", result));

        writer.write("<h2>result</h2>"+result);
        writer.write("<br>");
        writer.write("result="+result);
        writer.write("<br>");
        writer.write(result);
    }
}
