package org.example.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.exception.AppException;
import org.example.model.JSONResponse;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public abstract class AbstractBaseServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json");

        JSONResponse json = new JSONResponse();
        try {
            Object o = process(req);
            //业务处理成功: 返回success true和业务数据
            json.setSuccess(true);
            json.setData(o);
        }catch (Exception e){
            e.printStackTrace();
            //业务处理失败：返回false+错误码+错误信息
            if(e instanceof AppException){
                AppException ae = (AppException) e;
                json.setCode(ae.getCode());
                json.setMessage(ae.getMessage());
            }else{
                json.setCode("ERR");
                json.setMessage("系统出错了，请联系系统管理员");
            }
        }
        ObjectMapper m = new ObjectMapper();
        String s = m.writeValueAsString(json);
        resp.getWriter().println(s);
    }

    public abstract Object process(HttpServletRequest req) throws Exception;
}
