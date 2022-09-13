package paiza;
import java.util.Scanner;

public class paiza_ensyu1 {
//	整数 n と、要素数 n の数列 A と、整数 k が与えられるので、数列 A に含まれる数のうち、k 番目に大きいものを出力してください。
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int k = sc.nextInt();
//		仮の最大値maximum
		int maximum = 101;
		
//		k回ループを回す
		for (int i = 0; i < k; i++) {
			int nextMaximum = -100;
			
//			aの数列の要素を一つずつチェックする
			for (int value : a) {
				if (value < maximum) {
					nextMaximum = Math.max(nextMaximum, value);
				}
			}
			maximum = nextMaximum;
		}
		System.out.println(maximum);
	}
}
