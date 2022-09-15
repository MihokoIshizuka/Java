package paiza;

import java.util.Scanner;

public class paiza_next_nextLine {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 2; i++) {
			String a = sc.next();
			System.out.println(a);
		}
		System.out.println("=================");
		
		for (int i = 0; i < 2; i++) {
			String b = sc.nextLine();
			System.out.println(b);
		}
	}

}
