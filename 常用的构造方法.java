public class 常用的构造方法 {
    public static void main(String[] args) {
        /*一维字符 char a[]*/
        // 创建字符串
        // String(char a[])
        char a[] = {'a','b','c','d'};
        String b1 = new String(a);// 等价于 String b = new String('abc')

        // String(char a[],int offset,int length):offset开始截取的位置，length截取的长度
        String b2 = new String(a,2,1);

        // String(char[] value)
        String b3 = new String(a);// 将一维字符中的所有的元素合成一个字符串
        
        String a1,a2;
        a1 = "123";
        a2 = "abc";
    }
}