public class NewClass {
    // 属性的fields
    int id;
    String name;
    int age;
    Computer comp;

    //方法
    void study(){
        System.out.println("我在认真学习，使用的电脑品牌是"+comp.brand);
    }
    void play(){
        System.out.println("我在玩游戏，玩的是王者荣耀。");
    }
/**
    // 构造方法。用于创建这个类的对象。无参的构造方法可以由系统自动创造。名字必须与class名字相同
    NewClass(){
    }
*/
    //程序执行的入口，必须要有
    public static void main(String[] args) {
        NewClass stu = new NewClass();// 创建一个对象
        stu.id = 1001;
        stu.name = "国哥";
        stu.age = 18;

        Computer c1 = new Computer();
        c1.brand = "微星";
        stu.comp = c1;

        stu.play();
        stu.study();

    }
}
class Computer{
    String brand;
}
