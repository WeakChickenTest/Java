/**
 * User:WenJinGuo
 * DateTime:2020-08-19 19:49
 */
import java.sql.*;

public class JavaMySQL {
    Connection con;

    public Connection getConnection() {
        try {// try 和catch成对出现
            Class.forName("com.mysql.jdbc.Driver");// "com.mysql.jdbc.Driver"加载mysql数据库的驱动包
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            con = DriverManager.getConnection("jdbc:mysql://192.168.0.110:3306/Test","root","12345678");// 数据库的地址、远程连接用户名和密码
            System.out.println("数据库连接成功！");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }
    public static void main(String[] args) {
        JavaMySQL c = new JavaMySQL();
        c.getConnection();
    }
}