/**
 * @author WenJinGuo
 * @DateTime 2022/4/5 18:55
 */
package com.wjg.test1;// 在包里创建java会自动添加

public class TestExtends {
    public static void main(String[] args) {
//        Student stu1 = new Student();
//        stu1.name = "名字";
//        stu1.height = 170;
//        stu1.major = "上网打游戏";
//        stu1.study();
//        Student stu2 = new Student("嘻嘻",1,"挖掘机");
//        stu2.study();
//        stu2.rest();

        Student2 Age = new Student2("嘻嘻",'女',1,"挖掘机");
        Student stu = new Student("嘻嘻",1,"挖掘机");
        Age.Age2();
        stu.study();

    }
}

class Person {
    String name;
    int height;

    public void rest(){
        System.out.println("休息一会！");
    }
}

class Student extends Person{// 在类的后边加上extends和类名，就可以继承该类下的所有属性和方法
/**
 *    String name;
    int height;
 */
    String major;

    public void study(){
        System.out.println("我叫"+name+",我身高"+height+",我喜欢"+major);
    }
/**
 *    public void  rest(){
 *       System.out.println("休息一会！");
 *}
 */

    public Student(String name,int height,String major){
        this.name = name;
        this.height = height;
        this.major = major;
    }
    public Student (){
    }
}

class Student2 extends Student{
    char age;
    public void Age2(){
        System.out.println("我叫【"+name+"】,是一名【"+age+"生】,身高"+height+",我喜欢"+major);
    }
    public Student2(String name,char age,int height,String  major){
        this.name = name;
        this.age = age;
        this.height = height;
        this.major = major;
    }

    public Student2 (){
    }

}