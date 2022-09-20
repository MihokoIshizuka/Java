package paiza;

import java.util.Scanner;

public class paiza_enshu21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double N = sc.nextDouble();
		
//		小数第3位まで表示にする（小数第4位を四捨五入する）
		System.out.printf("%.3f\n", N);
	}

}
