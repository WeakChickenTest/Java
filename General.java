// 常规类型格式化
public class General {
    public static void main(String[] args) {
        String str1 = String.format("%s",190);
        String str2 = String.format("%x",1999);
        String str3 = String.format("%h","ABCD");

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}
