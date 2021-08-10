package org.example.servlet;

import org.example.dao.UserDAO;
import org.example.exception.AppException;
import org.example.model.User;
import org.example.util.JSONUtil;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;

@WebServlet("/login2")
public class Login2Servlet extends AbstractBaseServlet {
    @Override
    public Object process(HttpServletRequest req) throws Exception {
        User input = JSONUtil.deserialize(
                req.getInputStream(), User.class);

        //通过用户输入的账号在数据库查询
        User query = UserDAO.query(input.getUsername());
        if(query == null){
            throw new AppException("LOG001", "用户不存在");
        }else if(!query.getPassword().equals(input.getPassword())){
            throw new AppException("LOG002", "用户名或密码错误");
        }
        //登录成功
        //创建session并保存用户信息（略）

        return null;
    }
}
