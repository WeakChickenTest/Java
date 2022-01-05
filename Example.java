// 数组查询

import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
        int[] a = new int[]{1,8,9,4,5,6,7,2};
        Arrays.sort(a);
        int index1 = Arrays.binarySearch(a,4);
        System.out.println(index1);

        String[] str = new String[]{"jk","ef","cd","i","gh","ab"};
        Arrays.sort(str);
        int index2 = Arrays.binarySearch(str,"ef");
        System.out.println(index2);
    }
}
