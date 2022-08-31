package sevenDays_5;

public class prob5_8 {
	public static void main(String[] args) {
		int num[] = new int[5];
		int largeCount = 0;
		int smallCount = 0;
		int count = 0;
		for (int i = 0; i < num.length; i++) {
			num[i] = new java.util.Random().nextInt(20)-10;
			System.out.print(num[i] + " ");
		}
		System.out.println();
		
		for (int i = 0; i < num.length; i++) {
			if (num[i] > 0) {
				largeCount += 1;
			} else if (num[i] < 0) {
				smallCount += 1;
			} else {
				count += 1;
			}
		}
		System.out.println("0より大きい数：" + largeCount + "個");
		System.out.println("0より小さい数：" + smallCount + "個");
		System.out.println("0の個数：" + count + "個");
	}
}
