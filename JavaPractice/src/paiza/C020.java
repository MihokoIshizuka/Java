package paiza;

import java.util.Scanner;

public class C020 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double m = sc.nextInt();
	double p = sc.nextInt();
	double q = sc.nextInt();
	
	double fresh = m * (100 - p) / 100;
	double rest = fresh * (100 - q) / 100;
	System.out.println((double)rest);
}
}
