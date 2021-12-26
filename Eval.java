import java.util.Date;
public class Eval {
    public static void main(String[] args) {
        Date date = new Date();
        String year = String.format("%tY",date);// 将date格式化
        String month = String.format("%tB",date);
        String day = String.format("%td",date);
        System.out.println("今天是"+year+"年"+month+day+"日。");

        String hour = String.format("%tH",date);
        String minute = String.format("%tM",date);
        String second = String.format("%tS",date);
        System.out.println("现在是"+hour+"时"+minute+"分"+second+"秒。");

        // 时间戳
        String ShiJianChuo = String.format("%ts",date);
        System.out.println("现在的时间戳是"+ShiJianChuo);

        String Riqi = String.format("%tF",date);// 日期
        String  Shijian = String.format("%tT",date);// 时间
        System.out.println("当前时间是"+Riqi+"\t"+Shijian);
    }
}
