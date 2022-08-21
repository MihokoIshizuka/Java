package paiza;

import java.util.Scanner;

public class C112 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int min = 0;
	int max = 0;
	for (int i = 0; i < N; i++) {
		int s = sc.nextInt();
		int f = sc.nextInt();
		int t = sc.nextInt();
		int time = s + f + (24 - t);
		if (i == 0 ) {
			min = time;
			max = time;
		}
		if (time < min) {
			min = time;
		} else if (time > max) {
			max = time;
		}		
	}
	System.out.println(min);
	System.out.println(max);
}
}
