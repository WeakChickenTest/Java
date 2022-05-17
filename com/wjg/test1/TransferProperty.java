package com.wjg.test1;

public class TransferProperty {
    int i = 47;
    public void call(){
        System.out.println("diaoyong");
        for(i=0;i<3;i++){
            System.out.println(i+"");
            if(i==2){
                System.out.println("\n");
            }
        }
    }

    public TransferProperty(){
    }

    public static void main(String[] args){
        TransferProperty t1 = new TransferProperty();
        TransferProperty t2 = new TransferProperty();
        t2.i=60;
        System.out.println("111"+t1.i++);
        t1.call();
        System.out.println("222"+t2.i);
        t2.call();
    }
}
