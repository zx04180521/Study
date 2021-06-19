package MysqlTest;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


//这个代码适用于insert，delete，update
public class TestJDBC01 {
    public static void main(String[] args) throws SQLException {
        //1.创建数据源对象
        //  不同数据库会指定不同的类，MySQL指定MySQLDataSource类
        //  Java标准库还提供了一个DataSource接口
        //  其他数据库驱动包里提供的具体的数据源都实现了标准库的DataSource接口
        MysqlDataSource dataSource=new MysqlDataSource();
//        DataSource dataSource=new MysqlDataSource();//向上转型

        //2.指定数据源内部参数
        // 数据库所在的服务器地址，端口号，用户名，密码，具体访问那个数据库
//        ((MysqlDataSource)dataSource).setUser("root")
        dataSource.setUser("root");
        dataSource.setPassword("123456");
        dataSource.setURL("jdbc:mysql://127.0.0.1:3306/java41?characterEncoding=utf8&useSSL=true");

        //3.和服务器建立连接
        //  SQLException异常，使用jdbc操作数据库时，一旦执行某个环节出错就会出现这个异常
        //  比如用户名密码错误、ip地址端口号错误、数据库名不存在...
        Connection connection= dataSource.getConnection();

        //此时，准备阶段工作就绪
        //[1,2,3]准备工作，只需要程序启动时执行一次即可
        // 4.正式操作数据库，先构造一个SQL语句
        int id=105;
        String name="花荣";
        String sql="insert into student values(? ,'100100',?,'123456@qq.com',1)";
        PreparedStatement statement=connection.prepareStatement(sql);
        //setXXX 系列方法就是用来替换SQL中的动态的值
        //第一个参数决定替换第几个 ？ ，从1开始计数
        //第二个参数就是要替换的值
        //需要根据值的类型决定使用那个方法，setInt/setString/setDouble...
        statement.setInt(1,id);
        statement.setString(2,name);
        System.out.println("sql:"+statement.toString());


        //5.执行sql,针对insert，delete，update
        //  都使用executeUpdate()方法执行
        //  返回一个整数，表示影响到的行数
        //  这个方法本质是让程序给mysql服务器发送请求
        //  MySQL服务器收到请求之后就执行sql，并返回结果
        int ret =statement.executeUpdate();
        System.out.println("有"+ret+"行被影响到了");
        //[4,5]可以重复若干次，连接建立好之后，随时可以执行多个SQL

        //6. 收尾工作
        statement.close();
        connection.close();
        //收尾工作，针对每个不用的statement对象都需要close
        //针对connect的close 只要程序结束之前close即可

        //针对Connection，还有一种策略，每次服务器收到一个请求
        //都新建一个Connection，请求处理完了，就立即释放Connection
        //虽然这种方案需要频繁创建Connection，但是不打紧，因为DataSource有内置的
        //数据库连接池，建立好的Connection是可以被重复利用

    }
}
