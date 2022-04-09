package com.wjg.test1;

/**
 * @author WenJinGuo
 * @DateTime 2022/4/10 0:14
 */
public class StaticTest1 {               //定义静态常量
    final static double PI = 3.1415;    //定义静态变量
    static int id;

    public static void method1(){       //在类中定义静态方法
        //do Something
    }

    public void method2(){
        System.out.println(StaticTest1.PI);  //调用静态常量
        System.out.println(StaticTest1.id);  //调用静态变量
        StaticTest1.method1();               //调用静态方法
    }
}
