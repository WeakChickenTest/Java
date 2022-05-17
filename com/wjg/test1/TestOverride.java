package com.wjg.test1;

/**
 * @author WenJinGuo
 * @DateTime 2022/4/6 21:11
 * 方法的重写
 */
public class TestOverride {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.run();
        h.stop();
    }
}

class Vehicle{
    public void run(){
        System.out.println("普通的跑");
    }

    public void stop(){
        System.out.println("吁~");
    }

    public Person whoIsPsg(){
        return new Person();
    }
}

class Horse extends Vehicle{
    public void run(){// 在重写父类的方法时，要与父类的方法名保持一致
        System.out.println("快马加鞭,飞快的跑");
    }

    public Student whoIsPsg(){// 返回类型必须小于等于父类的类型
        return new Student();
    }
}