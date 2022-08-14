package sevenDays_4;

public class problem4_6_7 {

	public static void main(String[] args) {
//		while文を用いて、整数型変数 a を、以下のように変更し、表示するプログラムを作りなさい。
		int a = 3;
		while (a >= 0) {
			System.out.println("a = " + a);
			a--;
		}
		
//		上と同じ処理を、for文を用いて作りなさい。
		for (int i = 3; i >= 0; i--) {
			System.out.println("a = " + i);
		}
	}
}
