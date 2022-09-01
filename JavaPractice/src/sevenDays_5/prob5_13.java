package sevenDays_5;

public class prob5_13 {
//	３×３の二次元配列を作成し、それぞれに0から9の乱数を発生させ、実行例のように、その内容と、数値の最大値・最小値を表示させなさい。
	public static void main(String[] args) {
		int num[] = new int[9];
		int max = 0;
		int min = 0;
		for (int i = 0; i < num.length; i++) {
			num[i] = new java.util.Random().nextInt(10);
			System.out.print(num[i] + " ");
			if (i % 3 == 2) {
				System.out.println();
			}
			if (i == 0) {
				max = num[i];
				min = num[i];
			}
			if (num[i] > max) {
				max = num[i];
			} else if (num[i] < min) {
				min = num[i];
			}
		}
		System.out.println("最大値：" + max);
		System.out.println("最小値：" + min);
	}
}
