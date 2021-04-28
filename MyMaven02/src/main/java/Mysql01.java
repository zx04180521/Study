import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class Mysql01 {
    public static void main(String[] args) {
        // 1. 创建数据源对象.
        //    不同的数据库会指定不同的类~
        //    Java 标准库里还提供了一个 DataSource 接口.
        //    其他数据库驱动包里提供的具体的数据源类都是实现了
        //    标准库的 DataSource 接口的
        MysqlDataSource dataSource = new MysqlDataSource();
        
    }
}
