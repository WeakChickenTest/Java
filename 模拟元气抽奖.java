/**
 * User:WenJinGuo
 * DateTime:2020-07-04 13:39
 */
/*
* 说明：
* 本元气抽奖是根据手机QQ中的超级萌宠而来。
* 在手机QQ中的超级萌宠抽奖游戏中，有以下规则：
*   1.每一期总共有72颗蛋
*   2.有4种动物：小鸡、小鸭、大鹅和孔雀，分别对应2倍、3倍、6倍和50倍的奖励；
*   3.小鸡和小鸭出现的频率最高，大鹅其次，孔雀最低，根据上一次出现的次数分别是小鸡32次，小鸭24次，大鹅13次，孔雀3次
*   4.每只动物单次最高能押10000元气值
*   5.每次从下注到开奖有40秒，一局大概一分钟
*
* 技巧：
* 1.当小鸡、小鸭、大鹅押的元气值比例为3:2:1时，只要不抽中孔雀，都是不赔不赚，持平
* 2.上一期的开奖结果和本期已经开出的结果作参考
* 3.见过第一颗蛋就开出大鹅的，前3次开出孔雀的，连着7次开出小鸡的，连着3次开出大鹅的
* 4.可以按照3:2:1的比例在小鸡、小鸭和大鹅的身上下注，适当的在大鹅身上少下一点注，可以稍稍的赚一点
*
* 忠告：不要连着在大鹅身上少下注，大鹅身上少下注却抽中大鹅的话，赔的会非常多
* 如果经常在大鹅身上少下注的的话，会影响抽中大鹅的频率，我最开始玩的时候，一期中大鹅被抽中的次数也不过十多次，后来投机取巧的次数多了，大鹅能出现十八九次
*/

import java.util.Scanner;// 导入Java中的随机函数模块
public class 模拟元气抽奖 {
    public static void main(String[] args) {

        int 起始值=100000;// 元气值的起始值
        int a = 72;// 每期有72个蛋
        System.out.println("当前还有"+a+"个蛋");
        while (true){

            a = a-1;
            Scanner scanner = new Scanner(System.in);
            System.out.println("在小鸡身上押注数量:");
            int 小鸡 = scanner.nextInt();

            System.out.println("在小鸭身上押注数量:");
            int 小鸭 = scanner.nextInt();

            System.out.println("在大鹅身上押注数量:");
            int 大鹅 = scanner.nextInt();

            System.out.println("在孔雀身上押注数量:");
            int 孔雀 = scanner.nextInt();

            if(小鸡<=10000 & 小鸭<=10000 & 大鹅<=10000 & 孔雀<=10000){// 单个动物押注不能超过10000元气
                int sum = 小鸡+小鸭+大鹅+孔雀;
                if(sum<=起始值){// 押注的总和不能超过现有的
                    int 选择 = (int)(1+72*Math.random());// 从1~72中随机选择一个数字
                    // 根据选择的结果执行不同的倍数
                    if(1<=选择 & 选择<=18){
                        int 获得 = 小鸡(小鸡);
                        int 差值1 = 起始值;
                        起始值 = 起始值-(小鸡+小鸭+大鹅+孔雀)+获得;
                        int 差值2 = 起始值-差值1;
                        System.out.println("本次共下注"+sum+"元气，抽中了小鸡，获得了"+获得+"元气，还剩下"+起始值+"元气值，"+"变化值:"+差值2);
                        if(a==0){
                            System.out.println("没有蛋了，游戏结束！");
                            break;
                        }
                        System.out.println("当前还有剩"+a+"个蛋");

                    }else if(19<= 选择 & 选择 <=36){
                        int 获得 = 小鸭(小鸭);
                        int 差值1 = 起始值;
                        起始值 = 起始值-(小鸡+小鸭+大鹅+孔雀)+获得;
                        int 差值2 = 起始值-差值1;
                        System.out.println("本次共下注"+sum+"元气，抽中了小鸭，获得了"+获得+"元气，还剩下"+起始值+"元气值，"+"变化值:"+差值2);
                        if(a==0){
                            System.out.println("没有蛋了，游戏结束！");
                            break;
                        }
                        System.out.println("当前还有剩"+a+"个蛋");

                    }else if(37<=选择 & 选择 <=54) {
                        int 获得 = 大鹅(大鹅);
                        int 差值1 = 起始值;
                        起始值 = 起始值-(小鸡+小鸭+大鹅+孔雀)+获得;
                        int 差值2 = 起始值-差值1;
                        System.out.println("本次共下注"+sum+"元气，抽中了大鹅，获得了"+获得+"元气，还剩下"+起始值+"元气值，"+"变化值:"+差值2);
                        if(a==0){
                            System.out.println("没有蛋了，游戏结束！");
                            break;
                        }
                        System.out.println("当前还有剩"+a+"个蛋");

                    }else{
                        int 获得 = 孔雀(孔雀);
                        int 差值1 = 起始值;
                        起始值 = 起始值-(小鸡+小鸭+大鹅+孔雀)+获得;
                        int 差值2 = 起始值-差值1;
                        System.out.println("本次共下注"+sum+"元气，抽中了孔雀，获得了"+获得+"元气值，还剩下"+起始值+"元气值，"+"变化值"+差值2);
                        if(a==0){
                            System.out.println("没有蛋了，游戏结束！");
                            break;
                        }
                        System.out.println("当前还有剩"+a+"个蛋");

                    }
                }else{
                    System.out.println("很抱歉，您当前只有"+起始值+"元气");
                    System.out.println("当前还有剩"+a+"个蛋");
                }

            }else{
                System.out.println("每只动物每次最多押10000元气！");
                System.out.println("当前还有剩"+a+"个蛋");
            }
        }
    }

    // 抽中不同的动物时，进行不同的计算

    public static int 小鸡(int a){// 抽中一次小鸡，翻2倍
        int 获得 = a*2;
        return 获得;
    }

    public static int 小鸭(int a){// 抽中一次小鸭，翻3倍
        int 获得 = a*3;
        return 获得;
    }

    public static int 大鹅(int a){// 抽中一次大鹅，翻6倍
        int 获得 = a*6;
        return 获得;
    }

    public static int 孔雀(int a){// 抽中一次孔雀，翻50倍
        int 获得 = a*50;
        return 获得;
    }
}