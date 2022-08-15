package paiza;

public class FizzBuzz {
public static void main(String[] args) {
	System.out.println("整数の入力");
	int n = new java.util.Scanner(System.in).nextInt();
	
	for (int i = 1; i <= n; i++) {
		if (i % 3 == 0 && i % 5 == 0) {
			System.out.println("FizzBuzz");
		} else if (i % 3 == 0) {
			System.out.println("Fizz");
		} else if (i % 5 == 0) {
			System.out.println("Buzz");
		} else {
			System.out.println(i);
		}
	}
}
}
