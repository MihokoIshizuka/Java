package sevenDays_4;

public class problem4_1 {
//	１から10までの乱数を発生させ、その数を表示した後、forループを用いて、その数だけ■マークを表示するプログラムを作りなさい。
	public static void main(String[] args) {
		int num = (int)(Math.random()*10)+1;
		System.out.println("数：" + num);
		
		for(int i = 1; i <= num; i++) {
			System.out.println("■");
		}
	}
}
