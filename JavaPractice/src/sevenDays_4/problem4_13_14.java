package sevenDays_4;

public class problem4_13_14 {
//１から10までの乱数を発生させ、もしも5以上だったら、その数だけ★マークを表示し、5未満だったら、その数を表示するプログラムを作りなさい。
	public static void main(String[] args) {
		int num = (int)(Math.random()*10)+1;
		System.out.println(num);
		
		if (num >= 5) {
			for (int i = 0; i < num; i++) {
				System.out.print("★");
			}
		} else {
			System.out.println("発生した数値：" + num);
		}
		
//		1から10までの乱数を発生させ、偶数なら、★を、奇数なら☆を、それぞれ発生した数の文だけ表示するプログラムを作りなさい。
		int number = (int)(Math.random()*10)+1;
		System.out.println(number);
		if (number % 2 == 0) {
			for (int a = 0; a < number; a++) {
				System.out.print("★");
			}
		} else {
			for (int a = 0; a < number; a++) {
				System.out.print("☆");
			}
		}
	}
}
