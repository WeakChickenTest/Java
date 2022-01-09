import java.util.Scanner; // 导入键盘输入需要用到的包
public class PopupWindow {
    public static void main(String[] args) {
        int begin = 5;

        //循环
        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("要关闭弹窗吗:Yes/No");//输入的提示语
            String choice = scanner.next();

            //判断输入的内容是否为[yes]，equals区分字母大小写，equalsIgnoreCase不区分字母大小写
            boolean yes = choice.equalsIgnoreCase("Yes");
            boolean no = choice.equalsIgnoreCase("No");

            if(yes){
                //若判断的值为yes，则起始值-1
                begin --;

                if(begin == 0){
                    System.out.println("你已经连续输入了5次Yes，已彻底关闭了弹窗，以后不会再出现了。");
                    break;
                }else{
                    System.out.println("还有" + begin + "次，就会彻底关闭弹窗。");
                }
            }else if (no){
                //若判断的值为no，则起始值重置为5
                begin = begin + (5 - begin);
                System.out.println("恢复成" + begin + "次了");
            }else{
                System.out.println("只能输入Yes或No,请重新输入!");
                System.out.println("又回到了" + begin + "次。");
            }
        }
    }
}