import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Mysql01 {
    public static void main(String[] args) throws SQLException {
        MysqlDataSource dataSource=new MysqlDataSource();

        dataSource.setUser("root");
        dataSource.setPassword("123456");
        dataSource.setURL("jdbc:mysql://localhost:3306/java41?characterEncoding=utf8&useSSL=true");

        Connection connection=dataSource.getConnection();
        String str="select * from score";
        PreparedStatement statement=connection.prepareStatement(str);

        ResultSet resultSet= statement.executeQuery();
        while(resultSet.next()){
            System.out.println(resultSet.getDouble("score"));
            System.out.println(resultSet.getInt("student_id"));
            System.out.println(resultSet.getInt("course_id"));
        }
        resultSet.close();
        statement.close();
        connection.close();
    }
}
