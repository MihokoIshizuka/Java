package sevenDays_5;

public class prob5_10 {
	public static void main(String[] args) {
//	長さ7の整数型配列を生成しかなに1から10までの乱数を代入しなさい。その際、実行例にならって、その数の分だけ、*マークを表示するようにしなさい。
		int num[] = new int[7];
		for (int i = 0; i < num.length; i++) {
			num[i] = new java.util.Random().nextInt(10)+1;
			System.out.print(num[i] + " ");
		}
		System.out.println();
		
		for (int i = 0; i < num.length; i++) {
			for (int a = 1; a <= num[i]; a++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
