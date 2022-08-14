package sevenDays_4;

public class problem4_11_12 {
//forループを用いて、１から100までの乱数を５回発生させ、表示し、終了後その中の最大値を表示しなさい。
	public static void main(String[] args) {
		int max = 0;
		for(int i = 0; i < 5; i++) {
			int num = (int)(Math.random()*100)+1;
			System.out.println(num);
//			もしも乱数のnumがmaxを超える場合はその数字をmaxに代入する
			if (num > max) {
				max = num;
			}
		}
		System.out.println("最大値：" + max);
		
		
//		forループを用いて、１から１００までの乱数を５回発生させ、表示し、終了後その中の最小値を表示しなさい。
		int min = 100;
		for (int a = 0; a < 5; a++) {
			int number = (int)(Math.random()*100)+1;
			System.out.println(number);
			if (number < min) {
				min = number;
			}
		}
		System.out.println("最小値：" + min);
	}
}
