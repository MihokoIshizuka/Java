package paiza;

import java.util.Scanner;

public class C116 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int M = sc.nextInt();
	int count = 0;
	for (int i = 0; i < N; i++) {
		int n = sc.nextInt();
		if (n == 0) {
			count += 1;
		}
	}
	if (count >= M) {
		System.out.println("NG");
	} else {
		System.out.println("OK");
	}
}
}
