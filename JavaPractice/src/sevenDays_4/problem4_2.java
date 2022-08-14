package sevenDays_4;

public class problem4_2 {
//	4_1と同じ処理を、while文で作ったループで行いなさい。
	public static void main(String[] args) {
		int i = 0;
		int num = (int)(Math.random()*10)+1;
		System.out.println("数：" + num);
		
		while(i < num) {
			System.out.print("■");
			i++;
		}
	}
}
