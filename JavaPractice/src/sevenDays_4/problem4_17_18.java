package sevenDays_4;

public class problem4_17_18 {
//	forの二重ループを用いて、以下のような図形を表示させるプログラムを作りなさい。
public static void main(String[] args) {
//	行
	for (int i = 1; i <= 10; i++) { 
//		列
		for (int j = 1; j <= 10; j++) {
			if (j <= i) {
				System.out.print("■");
			} else {
				System.out.print("□");								
			}
		}
		System.out.println();
	}
	
//	forの二重ループを用いて、以下のような図形を表示させるプログラムを作りなさい
//	行
	for (int n = 0; n < 10; n++) {
//		列
		for (int m = 0; m < 10; m++) {
			if (n == m) {
				System.out.print("□");
			} else {
				System.out.print("■");
			}
		}
		System.out.println();
	}
}
}
