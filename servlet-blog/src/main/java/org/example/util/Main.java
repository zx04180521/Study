package org.example.util;

import lombok.Getter;
import lombok.Setter;
import org.example.model.JSONResponse;
import org.example.model.User;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        //模拟用户登录功能
        //1.解析请求数据
        User u = new User();
        u.setUsername("abc");
        u.setPassword("123");
        /**
         * 2.业务处理:
         * (1)用户不存在：根据账号在数据库查，如果查不到就是
         * (2)用户名或密码错误：数据库查询的用户密码和http请求用户输入的密码比对，如果不一致
         * (3)登录成功：以上条件都不满足
         */
        JSONResponse json = new JSONResponse();
        try {
            User query = query(u.getUsername());
            if(query == null){
                throw new MyException("LOG001", "用户不存在");
            }else if(!query.getPassword().equals(u.getPassword())){
                throw new MyException("LOG002", "用户名或密码错误");
            }
            //登录成功
            json.setSuccess(true);
        } catch (Exception e) {
            e.printStackTrace();
            //设置错误信息
            if(e instanceof MyException){
                MyException me = (MyException) e;
                json.setCode(me.getCode());
                json.setMessage(me.getMessage());
            }else{
                //非自定义异常，把错误信息转换为用户有意义的信息
                json.setCode("ERROR000");
                json.setMessage("系统出错了，请联系管理员");
            }
        }

        //3.返回响应数据
    }
    //模拟数据库根据账号查用户信息
    public static User query(String username) throws SQLException {
        User u = null;
        if("abc".equals(username)){//模拟查询到一条用户记录
            u = new User();
            u.setUsername(username);
            u.setPassword("123");
        }else if("a".equals(username)){//模拟jdbc代码抛异常
            throw new SQLException("column 'usernam' not found");
        }
        return u;

    }

    @Getter
    @Setter
    private static class MyException extends RuntimeException{
        private String code;

        public MyException(String code, String message) {
            super(message);
            this.code = code;
        }

        public MyException(String code, String message, Throwable cause) {
            super(message, cause);
            this.code = code;
        }
    }
}
