public class 字符串操作 {
    public static void main(String[] args) {
        String str = "AB CD EFG";
        String str2 = "Good";
        String str3 = "GOOD";
        String str4 = "GOOD";

        // 从指定位置到最后生成新的字符串
        String a = str.substring(3);
        // 从指定位置开始，截取到指定位置结束
        String b = str.substring(2,5);

        // 去除空格
        String c = str.trim();

        // 字符串替换
        String d = str.replace("A","FFF");// "A"是被替换的字符串，"FFF"是替换后的字符串

        // 判断字符串的开始是否为指定的字符(串)
        boolean b1 = str.startsWith("A");
        boolean b2 = str.startsWith("C");
        // 判断字符串的结尾是否为指定的字符(串)
        boolean b3 = str.endsWith("G");
        boolean b4 = str.endsWith("F");

        // 判断两个字符串是否相等

    }
}
