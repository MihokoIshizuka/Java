package sevenDays_5;

public class prob5_7 {
	public static void main(String[] args) {
		int num[] = new int[5];
		int math = 0;
		for (int i = 0; i < num.length; i++) {
			num[i] = new java.util.Random().nextInt(10)+1;
			System.out.print(num[i] + " ");
		}
		System.out.println();
		
//		配列の値の合計値と、平均値を表示する。
		System.out.print("合計値：");
		for (int i = 0; i < num.length; i++) {
			math += num[i];
		}
		System.out.print(math);
		System.out.println();
		
		System.out.print("平均値：" + (math / num.length));
		System.out.println();

//		平均値よりも大きい数を表示する
		System.out.print("平均値より大きい数：");
		for (int i = 0; i < num.length; i++) {
			if (num[i] > math / num.length) {
				System.out.print(num[i] + " ");
			}
		}
		System.out.println();
		
//		平均値よりも小さい数を表示する。		
		System.out.print("平均値より小さい数：");
		for (int i = 0; i < num.length; i++) {
			if (num[i] < math / num.length) {
				System.out.print(num[i] + " ");
			}
		}
	}
}
