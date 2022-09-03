package paiza;

import java.util.Scanner;

public class C112 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int N = scan.nextInt();
	int min = 0;
	int max = 0;
	for (int i = 0; i < N; i++) {
		int s = scan.nextInt();
		int f = scan.nextInt();
		int t = scan.nextInt();
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
