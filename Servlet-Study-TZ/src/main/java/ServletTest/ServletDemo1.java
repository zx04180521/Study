package ServletTest;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ServletDemo1 extends HelloServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        String encoding=req.getCharacterEncoding();
        String contentType=req.getContentType();
        String conTextPath=req.getContextPath();
        String ua=req.getHeader("User-Agent");
        String host=req.getHeader("Host");
        String host1=req.getParameter("Host");
        String method=req.getMethod();
        String protocol=req.getProtocol();
        String queryString=req.getQueryString();
        String url=req.getRequestURI();
        int contentLength=req.getContentLength();

        PrintWriter writer=resp.getWriter();
        writer.write("<html>");
        writer.write("<br/>");
        writer.write("encoding:"+encoding);
        writer.write("<br/>");
        writer.write("contentType:"+contentType);
        writer.write("<br/>");
        writer.write("conTextPath:"+conTextPath);
        writer.write("<br/>");
        writer.write("ua:"+ua);
        writer.write("<br/>");
        writer.write("host:"+host);
        writer.write("<br/>");
        writer.write("host1:"+host1);
        writer.write("<br/>");
        writer.write("method:"+method);
        writer.write("<br/>");
        writer.write("protocol:"+protocol);
        writer.write("<br/>");
        writer.write("queryString:"+queryString);
        writer.write("<br/>");
        writer.write("url:"+url);
        writer.write("<br/>");
        writer.write("contentLength:"+contentLength);
        writer.write("张鑫");
        writer.write("</html>");
    }
}
