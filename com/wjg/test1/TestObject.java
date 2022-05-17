package com.wjg.test1;

/**
 * @author WenJinGuo
 * @DateTime 2022/4/6 21:26
 *
 * Object的重写
 */
public class TestObject {
    public static void main(String[] args) {
        // Object obj;
        TestObject to = new TestObject();
        System.out.println(to.toString());

        Person2 p = new Person2("哦吼",2);
        System.out.println(p.toString());
    }

    public  String toString(){
        return "测试Object对象";
    }
}

class Person2{
    String name;
    int age;

    public String toString(){
        return "我叫"+name+",今年"+age;
    }

    public Person2(String name,int age){
        this.name = name;
        this.age = age;
    }
}