package MysqlTest;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//使用于 select
public class TestJDBC02 {
    public static void main(String[] args) throws SQLException {
        //1.创建数据源
        MysqlDataSource dataSource=new MysqlDataSource();
        //2.设置数据源参数
        dataSource.setUser("root");
        dataSource.setPassword("123456");
        dataSource.setURL("jdbc:mysql://127.0.0.1:3306/java41?characterEncoding=utf8&useSSL=true");
        //3.建立连接
        Connection connection=dataSource.getConnection();
        //4.构造SQL
        String sql="select * from student";
        PreparedStatement statement=connection.prepareStatement(sql);

        //5.执行SQL(这里开始和插入不一样)
        ResultSet resultSet=statement.executeQuery();
        while(resultSet.next()){
            //读取到其中每一条记录的每一列
            //参数就是表的列名
            //使用getXXX 来获取，根据列的类型决定使用什么版本
            int id=resultSet.getInt("id");
            String name=resultSet.getString("name");
            int classId=resultSet.getInt("classes_id");
            System.out.println(id+","+name+","+classId);
        }
        //7.收尾工作，顺序很重要
        resultSet.close();
        statement.close();
        connection.close();

    }
}
