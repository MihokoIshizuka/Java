package sevenDays_5;

public class prob5_6 {
	public static void main(String[] args) {
		int data[] = new int[10];
		int max = 0;
		int min = 0;
		int math = 0;
		for (int i = 0; i < data.length; i++) {
			data[i] = new java.util.Random().nextInt(10)+1;
			System.out.print(data[i] + " ");
		}
		System.out.println();
		
		System.out.print("最大値：");
		for (int i = 0; i < data.length; i++) {
			if (i == 0) {
				max = data[i];
			}
			if (data[i] > max) {
				max = data[i];
			}
		}
		System.out.print(max);
		System.out.println();
		
		System.out.print("最小値：");
		for (int i = 0; i < data.length; i++) {
			if (i == 0) {
				min = data[i];
			}
			if (data[i] < min) {
				min = data[i];
			}
		}
		System.out.print(min);
		System.out.println();
		
		System.out.print("平均値：");
		for (int i = 0; i < data.length; i++) {
			math += data[i];
		}
		System.out.print(math / data.length);
	}
}
