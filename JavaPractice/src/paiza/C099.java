package paiza;

import java.util.Scanner;

public class C099 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int D = sc.nextInt();
	int area = 0;
	for (int i = 1; i < N; i++) {
		int d = sc.nextInt();
		area += (d * D);
	}
	System.out.println(D * D * N - area);
}
}
