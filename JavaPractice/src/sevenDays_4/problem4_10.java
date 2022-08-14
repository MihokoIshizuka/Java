package sevenDays_4;

public class problem4_10 {
//	forループを用いて、１から100までの乱数を５回発生させ、表示させなさい。
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			int num = (int) (Math.random()*100)+1;
			System.out.println(num);
		}
	}
}
