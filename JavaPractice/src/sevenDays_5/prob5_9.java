package sevenDays_5;

public class prob5_9 {
	public static void main(String[] args) {
		int num[] = new int[10];
		for (int i = 0;i < num.length; i++) {
			num[i] = new java.util.Random().nextInt(100)+1;
			System.out.print(num[i] + " ");
		}
		System.out.println();
		System.out.print("50以上の数：");
		for (int i = 0;i < num.length; i++) {
			if (num[i] >= 50) {
				System.out.print(num[i] + " ");
			}
		}
		System.out.println();
		System.out.print("50未満の数：");
		for (int i = 0;i < num.length; i++) {
			if (num[i] < 50) {
				System.out.print(num[i] + " ");
			}
		}
	}
}
