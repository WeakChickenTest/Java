public class Trap {
	public static void main(String[] args) {
		int[][] b = new int[][]{{1},{2,3},{4,5,6}};// 定义二维数组
		for (int[] ints : b) {
			for (int anInt : ints) {//循环遍历二维数组中的每个元素
				System.out.println(anInt);    // 将数组中的元素输出
			}
			System.out.println();
		}
	}
}