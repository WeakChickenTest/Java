/**
 * @Author WenJinGuo
 * @create 2021/1/1 17:36
 */
// 使用equals和equalsIgnoreCase比较两个字符串
public class Opinion {
    public static void main (String args[]){
        String s1 = new String("abcABC");
        String s2 = new String("abcABC");
        String s3 = new String("abcabc");
        boolean b1 = s1.equals(s2);
        boolean b2 = s1.equals(s3);// 区分大小写
        boolean b3 = s1.equalsIgnoreCase(s3);// 不区分大小写
// str.toLowerCase()和str.toUpperCase(),str是要转换的字符串
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        String c1 = s1.toLowerCase();// s1.toLowerCase()全部转换成小写
        String c2 = s1.toUpperCase();// s1.toUpperCase()全部转换成大写
        System.out.println(c1);
        System.out.println(c2);
    }
}
