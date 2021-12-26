public class 一维数组 {
    public static void main(String[] args) {

        // 数组的2中声明方法
        int shuzi[];
        String[] str;

        // 为数组分配内存空间
        shuzi = new int[10];// 10是指数组元素的个数

        // 生命的同时分配空间
        int month[] = new int[19];// 数组的元素类型 数组名 = new 数组的元素类型[数组元素的个数]

        // 初始化一位数组
        int shuzi2[] = new int[]{1,2,3,4,5};

        //使用一维数组
        int day[] = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
        for (int i = 0;i < 12;i++){
            System.out.println((i+1)+"月有"+day[i]+"天。");
        }
    }
}
