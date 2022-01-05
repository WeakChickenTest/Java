public class Trap {
	public static void main(String[] args) {
		int b[][] = new int[][]{{1},{2,3},{4,5,6}};// 定义二维数组
		for (int k = 0;k<b.length;k++){
			for (int c = 0;c<b[k].length;c++){//循环遍历二维数组中的每个元素
				System.out.println(b[k][c]);	// 将数组中的元素输出
			}
			System.out.println();
		}
	}
}