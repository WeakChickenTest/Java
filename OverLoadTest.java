/*
* 方法重载有以下3种：
* 1、参数数量不同
* 2、参数类型不同
* 3、参数顺序不同
*
* 注意：返回的参数类型不同不构成方法重载
*/
import java.math.BigInteger;

public class OverLoadTest {

    public static double add(int a,double b){// 用来对比的方法
        return a + b;
    }

    public static int add(int a){// 与标准方法相比，参数的数量不同
        return a;
    }

    public static int add(int a,int b){// 与标准方法相比，参数的类型不同
        return 1998;
    }

    public static double add(double a,int b){// 与标准方法相比，参数的顺序不同
        return a + b + 2021;
    }

    public static void main(String[] args) {
        System.out.println("调用add(int a)方法："+add(1));
        System.out.println("调用add(int a,int b)方法："+add(1,123));
        System.out.println("调用add(int a,double b)方法："+add(1,1.23));
        System.out.println("调用add(double a,int b)方法："+add(3.14,1));

        BigInteger bigInteger = new BigInteger("4");// 实例化一个大数字
        System.out.println(bigInteger);
    }
}
