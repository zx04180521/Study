package org.example.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.dao.ArticleDAO;
import org.example.model.Article;
import org.example.model.JSONResponse;
import org.example.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet("/articleList")
public class ArticleListServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json");

        JSONResponse json = new JSONResponse();
        try {
            //业务：查询文章列表
            //数据库查询当前用户关联的文章数据，返回
            //需要只查询当前用户文章: 获取不到
            HttpSession session = req.getSession(false);
            User user = (User) session.getAttribute("user");

            //TODO 代码复用：只有这一行是业务代码，每个接口不同，其他部分都是相同的
            List<Article> query = ArticleDAO.query(user.getId());
            //业务处理成功: 返回success true和业务数据
            json.setSuccess(true);
            json.setData(query);
        }catch (Exception e){
            e.printStackTrace();
            //业务处理失败：返回false+错误码+错误信息
            //TODO 简单返回错误
            json.setCode("ERR");
            json.setMessage("系统出错了，请联系系统管理员");
        }
        ObjectMapper m = new ObjectMapper();
        String s = m.writeValueAsString(json);
        resp.getWriter().println(s);
    }
}
