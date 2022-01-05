// 使用sort对数组进行排序，按照字典编排顺序，数字排在字母前
import java.util.Arrays;

public class Taxis {
    public static void main(String[] args) {
        int[] arr = new int[]{3,6,3,8,2,34,15,89,43,17,57};
        Arrays.sort(arr);
        for (int i:arr){
            System.out.println(i);
        }
    }
}