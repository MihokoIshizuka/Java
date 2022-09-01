package sevenDays_5;

public class prob5_12 {
//	3×3の二次元配列を作成し、それぞれに0から9の乱数を発生させ、実行例にならいその内容を表示させなさい。
	public static void main(String[] args) {
		int num[] = new int[9];
		for (int a = 0; a < num.length; a++) {
			num[a] = new java.util.Random().nextInt(10);
			System.out.print(num[a] + " ");
			if (a % 3 == 2) {
				System.out.println();
			}
			
		}
	}
}
