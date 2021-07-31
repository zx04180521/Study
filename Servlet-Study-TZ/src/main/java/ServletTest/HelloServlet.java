package ServletTest;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//创建一个类，继承自HttpServlet(Servlet.jar提供的类)这样的父类
//重写doXXX 方法（doGet/doPost/doPut/doDelete...）
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //先写一个简单的HelloServlet
        //请求无论是啥，相应都返回 ServletTest.HelloServlet
        resp.getWriter().write("<h1>Hello Servlet</h1>");//把一个字符串写到HTTP相应的body中
    }

}
