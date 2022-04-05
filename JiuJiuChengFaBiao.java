/**
 * @Author WenJinGuo
 * @reate 2020/12/29 21:19
 */
public class JiuJiuChengFaBiao {
    public static void main(String[] args) {
        for(int a = 1;a<=9;a++){
            for(int b = 1;b<=a;b++){
                if(a==b){
                    System.out.println(b+"*"+a+"="+b*a);
                }else{
                    System.out.print(b+"*"+a+"="+b*a+"\t");
                }
            }
        }
    }
}
