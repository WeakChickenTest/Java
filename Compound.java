/**
 * @Author WenJinGuo
 * @create 2020/12/30 23:21
 */
public class Compound { // 复合语句
    public static void main(String[] args) {
        int x = 20;
        {
            int y = 40; // 语句中的变量只能在语句块中使用
            System.out.println(y);
            int z = 245;
            boolean b;
            {
                b = y > z;
                System.out.println(b);
            }
        }
        String word = "Hello,word!";
        System.out.println(word);
    }
}
