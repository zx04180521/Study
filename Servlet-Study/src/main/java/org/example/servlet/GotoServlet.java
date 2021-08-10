package org.example.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/goto")
public class GotoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        req.setCharacterEncoding("UTF-8");
//        resp.setCharacterEncoding("UTF-8");

        //解析请求数据: 键为type，为1转发，2重定向
        String type = req.getParameter("type");
        if("1".equals(type)){
            //转发
            req.getRequestDispatcher("home.html")
                    .forward(req, resp);
        }else{
            //重定向
            resp.sendRedirect("home.html");
        }
    }
}
