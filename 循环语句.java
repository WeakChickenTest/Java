public class 循环语句 {
    public static void main(String[] args) {
        int a = 199;

        // while循环
        int x = 10;
        while( x < 20 ) {
            System.out.print("value of x:" + x );
            x++;
            System.out.print("\n");
        }

        // do……while循环
        do{
            a++;
            System.out.println("这是do……while循环");
        }while(a<=200);//do……while与while的区别是do……while(条件)有分号;

        // for循环
        for(int b = 10; b < 20; b = b+1) {
            System.out.println("value of x : " + x );
        }
    }
}