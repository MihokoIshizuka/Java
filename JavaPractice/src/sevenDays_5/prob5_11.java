package sevenDays_5;

public class prob5_11 {
//	長さ5の整数型の配列変数を生成し、なかに1から100までの乱数を代入し、実行例に倣ってその結果を表示しなさい。その際、0以上60未満の数値、60以上80未満の数値、80以上の数値をすべて表示しなさい。
	public static void main (String[] args) {
		int num[] = new int[5];
		for (int i = 0; i < num.length; i++) {
			num[i] = new java.util.Random().nextInt(100)+1;
			System.out.print(num[i] + " ");
		}
		System.out.println();
		
		System.out.print("0以上60未満：");
		for (int i = 0; i < num.length; i++) {
			if (num[i] >= 0 && num[i] < 60) {
				System.out.print(num[i] + " ");
			}
		}
		System.out.println();
		
		System.out.print("60以上80未満：");
		for (int i = 0; i < num.length; i++) {
			if (num[i] >= 60 && num[i] < 80) {
				System.out.print(num[i] + " ");
			}
		}
		System.out.println();
		
		System.out.print("80以上：");
		for (int i = 0; i < num.length; i++) {
			if (num[i] >= 80) {
				System.out.print(num[i] + " ");
			}
		}
	}
}
