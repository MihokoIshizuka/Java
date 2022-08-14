package sevenDays_4;

public class problem4_4_5 {
//	while文を用いて、整数型変数 a を、以下のように変更し、表示するプログラムを作りなさい。
	public static void main(String[] args) {
		int a = 0;
		while(a <= 3) {
			System.out.println("a = " + a);
			a++;
		}
		
//		上と同じ処理を、for文を用いて作りなさい。
		for (int i = 0; i <=3; i++) {
			System.out.println("a = " + i);
		}
	}
}
