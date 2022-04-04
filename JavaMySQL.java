/**
 * User:WenJinGuo
 * DateTime:2020-08-19 19:49
 */
import java.sql.*;

public class JavaMySQL {
    static Connection con;
    static Statement sql;
    static ResultSet res;

    public Connection getConnection() {
        try {// try和catch成对出现
            Class.forName("com.mysql.jdbc.Driver");// "com.mysql.jdbc.Driver"加载MySQL数据库的驱动包
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            // 数据库的地址、远程连接用户名和密码
            con = DriverManager.getConnection("jdbc:mysql://192.168.0.139:3306/信息库","root","123456");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }
    public static void main(String[] args) {
        JavaMySQL c = new JavaMySQL();
        con = c.getConnection();
        try {
            sql = con.createStatement();
            res = sql.executeQuery("select * from tb_stu");
            while (res.next()) {
                String id = res.getString("id");
                String name = res.getString("name");
                String sex = res.getString("sex");
                String birthday = res.getString("birthday");
                System.out.print("编号:" + id + "\t");
                System.out.print("姓名:" + name + "\t");
                System.out.print("性别:" + sex + "\t");
                System.out.println("出生日期:" + birthday);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}