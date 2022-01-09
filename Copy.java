/*
 * 使用copyOf和copyOfRange复制数组.
 * copyOf与copyOfRange不同的地方：copyOf只能从索引为0的地方开始，copyOfRange可以指定开始复制的地方
 * copyOf与copyOfRange相同的地方：复制的长度都可以超出被复制数组的长度
 * copyOfRange要点：1、起始位置不可以大于被复制数组的长度；2、结束位置不可以小于起始位置；3、如果起始位置与结束位置相等，则复制的内容将是空的
 */
import java.util.Arrays;

public class Copy {
    public static void main(String[] args) {
        int[] arr = new int[]{23,42,12,35};

        // 使用copyOf复制数组
        int[] newArr1 = Arrays.copyOf(arr,5);// 由于arr只有4个元素，而newArr有5个元素的长度，所以缺少的会自动用0补全
        for (int j : newArr1) {
            System.out.println(j);
        }

        System.out.println();

        // 使用copyOfRange复制数组
        int[] newArr2 = Arrays.copyOfRange(arr,2,8);// 复制从2开始，到8结束的元素，不包括8
        for (int j : newArr2) {
            System.out.println(j);
        }
    }
}