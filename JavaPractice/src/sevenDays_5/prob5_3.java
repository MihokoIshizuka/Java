package sevenDays_5;

public class prob5_3 {
//	大きさは、10
//	値は、１から100の乱数
//	値をすべて表示し、その中の偶数の数と、奇数の数を表示するようにしなさい
	public static void main(String[] args) {
		int data[] = new int[10];
		for (int i = 0; i < data.length; i++) {
			data[i] = new java.util.Random().nextInt(100)+1;
		}
		
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println();
		
		System.out.print("奇数：");
		for (int i = 0; i < data.length; i++) {
			if (data[i] % 2 != 0) {
				System.out.print(data[i] + " ");
			}
		}
		System.out.println();
		System.out.print("偶数：");
		for (int i = 0; i < data.length; i++) {
			if (data[i] % 2 == 0) {
				System.out.print(data[i] + " ");
			}
		}
		
	}
}
