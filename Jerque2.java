/*
 * 字符串生成器的使用
 */

public class Jerque2 {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("这是初始状态的字符串");

        // 在字符串尾部添加
        builder.append("，在builder字符串位图追加的字符串");
        System.out.println(builder);

        // 在字符串指定位置添加的字符串
        builder.insert(2,"添加到指定位置的字符串");
        System.out.println(builder);

        // 删除指定位置的字符串
        builder.delete(2,6);
        System.out.println(builder);

        // 将StringBuilder字符串编程String字符串
        String str = builder.toString();
        System.out.println(str);

    }
}
