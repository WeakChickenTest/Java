public class Switch语句 {
    public static void main(String[] args) {
        int week = 1;
        switch(week){
            case 1:
                System.out.println("今天是周一，要上班");
                String kaka = "测试语句";
                break;// 遇到break，就会跳出当前的switch语句，继续执行switch后边的语句
            // 没有break，会把其他的case也执行了
            case 2:
                System.out.println("今天是周二，要上班");
            case 3:
                System.out.println("今天是周三，要上班");
            default:// 如果没有一个case的值符合，则执行
                System.out.println("不是周一，不是周二，也不是周三");
        }
        System.out.println("这是跳出switch语句后继续执行的语句。");
    }
}