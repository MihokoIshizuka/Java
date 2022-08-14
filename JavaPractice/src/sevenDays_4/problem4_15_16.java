package sevenDays_4;

public class problem4_15_16 {
public static void main(String[] args) {
//	ループを用いて、１から100までの数字を表示しなさい。ただし、このとき、数は10ごとに改行すること
//	for (int i = 1; i <= 100; i++) {
//		System.out.print(i);
//		if (i % 10 == 0) {
//			System.out.println();
//		}
//	}
	
//	forの二重ループを用いて、以下のように九九の表を作りなさい。
	for (int a = 1; a < 10; a++) {
		for (int b = 1; b < 10; b++) {
			System.out.print(a + "*" + b + "=" + (a * b));
			if (b == 9) {
				System.out.println();
			}
		}
	}
}
}
