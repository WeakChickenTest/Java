import java.util.Scanner; // 导入键盘输入需要用到的包
public class 弹窗问题解决 {
    public static void main(String[] args) {
        int 起始 = 5; // 最开始的值
        System.out.println(起始);
        while(true) { // 循环
            Scanner scanner=new Scanner(System.in); // 创建对象
            System.out.println("要关闭弹窗吗:Yes/No"); // 输入的提示语
            String 选择=scanner.next();// 将键盘输入的值赋给变量选择
            boolean 判断1 = 选择.equalsIgnoreCase("Yes"); // 判断输入的内容是否为[yes]，equals区分字母大小写，equalsIgnoreCase不区分字母大小写
            boolean 判断2 = 选择.equalsIgnoreCase("No");
            if(判断1){ // 若判断的值为True，则起始值-1
                起始 = 起始 - 1;
                System.out.println("还有"+起始+"次，就会彻底关闭弹窗。");
                if(起始==0){
                    break;
                }
            }else if (判断2){// 若判断的值为True，则起始值重置为5
                起始 = 起始 + (5 - 起始);
                System.out.println(起始);
            }else{
                System.out.println("只能输入Yes或No,请重新输入!");
                System.out.println("又回到了"+起始+"次。");
            }
        }
    }
}