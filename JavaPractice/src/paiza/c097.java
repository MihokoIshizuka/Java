package paiza;

public class c097 {
	public static void main(String[] args) {
		System.out.println("応募者の数を入力");
		int n = new java.util.Scanner(System.in).nextInt();
		System.out.println("プレゼントAの倍数を入力");
		int a = new java.util.Scanner(System.in).nextInt();
		System.out.println("プレゼントBの倍数を入力");
		int b = new java.util.Scanner(System.in).nextInt();
		
		for (int i = 1; i <= n; i++) {
			if (i % a == 0 && i % b == 0) {
				System.out.println("AB");
			} else if (i % a == 0) {
				System.out.println("A");
			} else if (i % b == 0) {
				System.out.println("A");
			} else {
				System.out.println("N");
			}
		}
	}
}
