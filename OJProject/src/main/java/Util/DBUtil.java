package Util;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtil {
    public static MysqlDataSource dataSource =null;
    public static String URL="jdbc:mysql://localhost:3306/ojProject?characterEncoding=utf8&useSSL=true";
    public static String USER="root";
    public static String PASSWORD="123456";
    public static MysqlDataSource getDataSource(){
        if (dataSource ==null){
            dataSource=new MysqlDataSource();
            dataSource.setURL(URL);
            dataSource.setUser(USER);
            dataSource.setPassword(PASSWORD);
        }
        return dataSource;
    }
    public static Connection getConnection(){
        try {
            return getDataSource().getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void close(Connection connection, PreparedStatement statement, ResultSet resultSet){
        if(resultSet!=null){
            try {
                resultSet.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if(statement!=null){
            try {
                statement.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if(connection!=null){
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}
