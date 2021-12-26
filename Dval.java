/**
 * User:WenJinGuo
 * DateTime: 2021/3/3 0:26
 */
import java.util.Date;// 导入需要的java包

public class Dval {
    public static void main(String[] args) {
        Date date = new Date();
        String year = String.format("%tY",date);
        String month = String.format("%tm",date);
        String day = String.format("%td",date);
        System.out.println("今天是"+year+"年"+month+"月"+day+"日");
    }
}