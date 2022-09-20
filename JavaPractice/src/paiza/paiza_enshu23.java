package paiza;
import java.util.Scanner;

public class paiza_enshu23 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double N = sc.nextDouble();
//		小数点第4位を四捨五入
		System.out.printf("%.3f\n", N);
		
		int M = sc.nextInt();
//		最大文字数の指定（前をスペースで埋める）
		System.out.printf("%10s\n", M);
		
//		最大文字数の指定（後をスペースで埋める）
		System.out.printf("%-10s\n", M);
		
//		最小文字の指定（最初の文字）
		System.out.printf("%.2s\n", M);
		
//		最大文字の指定（前を0で埋める）
		System.out.printf("%05d\n", M);

	}
}
