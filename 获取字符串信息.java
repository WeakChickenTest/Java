public class 获取字符串信息 {
    public static void main(String[] args) {
        String str = "We are students.";

        // 获取字符串长度
        int a = str.length();
        // 获取字符首次出现的位置
        int size1 = str.indexOf("a");
        // 获取字符最后出现的位置
        int size2 = str.lastIndexOf("d");
        // 返回指定位置的字符
        char myChar = str.charAt(4);// 范围0——str.length()
        System.out.println("字符串的长度是"+a);
        System.out.println("字符a首次出现的位置是" + size1);
        System.out.println("字符d最后出现的位置是" + size2);
        System.out.println("字符串str索引为4的位置上是" + myChar);
    }
}
