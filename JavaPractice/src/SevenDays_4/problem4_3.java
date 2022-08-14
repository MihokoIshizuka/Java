package SevenDays_4;

public class problem4_3 {
//	4_1と同じ処理を、do～while文を用いたループで行いなさい。
	public static void main(String[] args) {
		int i = 0;
		int num = (int)(Math.random()*10)+1;
		System.out.println("数：" + num);
		do {
			System.out.print("■");
			i++;
		} while (i < num);
	}
}
