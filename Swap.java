// 使用fill填充数组元素

import java.util.Arrays;

public class Swap {
    public static void main(String[] args){

        // 使用fill(int[] a,int value)填充数组元素，a是数组。value是所有元素的值
        int[] arr1 = new int[5];
        Arrays.fill(arr1,78);
        for (int i = 0;i<arr1.length;i++) {
            System.out.println("第" + i + "个元素是" + arr1[i]);
        }

        System.out.println();

        // 使用(int[] a,int fromIndex,int toIndex,int value)填充指定范围内的元素
        int[] arr2 = new int[]{45,12,2,0};
        Arrays.fill(arr2,0,2,1000);
        for (int i = 0;i<arr2.length;i++){
            System.out.println("第" + i + "个元素是" + arr2[i]);
        }
    }
}
