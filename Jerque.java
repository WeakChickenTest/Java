public class Jerque {
    public static void main(String[] args) {
        String str = "";
        long starTime = System.currentTimeMillis();// 定义对字符串执行操作的起始时间
        // 利用for循环，进行10000次操作
        for (int i = 0;i < 10000;i++){
            str = str + i;// 循环追加字符串
        }
        long endTime = System.currentTimeMillis();// 定义对字符串操作的结束时间
        long time = endTime - starTime;// 计算对字符串执行操作的时间
        System.out.println("String消耗时间："+time);

        StringBuilder builder = new StringBuilder("");// 创建字符串生成器
        starTime = System.currentTimeMillis();
        // 利用for循环进行操作
        for (int i = 0;i <10000;i++){
            builder.append(i);// 循环追加字符
        }
        endTime = System.currentTimeMillis();
        time = endTime - starTime;// 计算追加操作执行的时间
        System.out.println("StringBuilder消耗时间："+time);
    }
}
