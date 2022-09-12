package paiza;

import java.util.Scanner;

public class paiza__prob {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] num = new int[N];
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
			System.out.println(num[i]);
		}
	}
}
