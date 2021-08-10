package model;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//用于管理数据库连接
//（1）建立连接
//（2）断开连接
// jdbc使用DataSource管理连接
//BDUtil相当于对DataSource在稍微包装一层
//DataSource 每个应用应该只有一个实例（单例）
//DBUtil本质上实现了一个单例模式，管理了唯一的一个DataSource实例
public class DBUtil {
    private static MysqlDataSource dataSource=null;
    private static final String URL="jdbc:mysql://127.0.0.1:3306/myblogdemo?characterEncoding=utf8&useSSL=true";
    private static final String USERNAME="root";
    private static final String PASSWORD="123456";
    public static MysqlDataSource getDataSource(){
        if(dataSource==null){
            dataSource=new MysqlDataSource();
            dataSource.setUser(USERNAME);
            dataSource.setPassword(PASSWORD);
            dataSource.setURL(URL);
        }
        return dataSource;
    }
    //通过这个方法建立连接
    public static Connection getConnection(){
        try {
            return getDataSource().getConnection();
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }
    //通过这个方法断开连接
    public static void close(Connection c, PreparedStatement ps, ResultSet rs) {
        try {
            if(rs!=null){
                rs.close();
             }
            if (ps!=null) {
                ps.close();
            }
            if (c!=null) {
                c.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}

