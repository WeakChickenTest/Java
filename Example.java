// 二分搜索法搜索数组

import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
        int[] a = new int[]{1,8,9,4,5,6,7,2};
        Arrays.sort(a);
        int index1 = Arrays.binarySearch(a,4);
        System.out.println("4的索引位置是："+index1);
    }
}
