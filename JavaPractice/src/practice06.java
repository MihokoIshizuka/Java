//java言語基本
public class practice06 {
	
//	1から10までの乱数を発生させてそれを画面に表示し、5以上ならば、”5以上です”と表示するプログラムを作りなさい。
//	public static void main(String[] args) {
//		int r = new java.util.Random().nextInt(10)+1;
//		System.out.println(r);
//		if(r >= 5) {
//			System.out.println("5以上です");
//		}
//	}
	
//	1から10までの乱数を発生させてそれを画面に表示し、その値が1でなければ”１ではありません”と表示するプログラムを作りなさい。
//	public static void main(String[] args) {
//		int r = new java.util.Random().nextInt(10)+1;
//		System.out.println(r);
//		if(r != 1) {
//			System.out.println("1ではありません");
//		}
//	}
	
//	1から100までの乱数を発生させてそれを画面に表示し、、50未満ならば、”50未満です”と表示するプログラムを作りなさい。
//	public static void main(String[] args) {
//		int r = new java.util.Random().nextInt(100)+1;
//		System.out.println(r);
//		
//		if(r < 50) {
//			System.out.println("50未満です");
//		}
//	}
	
//	1から100までの乱数を発生させてそれを画面に表示し、値が10以下か、90以上なら、”10以下か90以上の値です”と表示するプログラムを作りなさい。
//	public static void main(String[] args) {
//		int r = new java.util.Random().nextInt(100)+1;
//		System.out.println(r);
//		if(r <= 10 || r >= 90) {
//			System.out.println("10以下か90以上の値です");
//		}
//	}
	
//	1から100までの乱数を発生させてそれを画面に表示し、値が20以上80未満であれば、”20以上80未満です”と表示するプログラムを作りなさい。
//	public static void main(String[] args) {
//		int r = new java.util.Random().nextInt(100)+1;
//		System.out.println(r);
//		if(r >= 20 || r < 80) {
//			System.out.println("20以上80未満です");
//		}
//	}
	
//	public static void main(String[] args) {
//        int num = (int)(Math.random()*6)+1;    //  1から6までの乱数を発生させる
//        System.out.println("数値 : " + num);
//        if(num >= 3) {
//        	System.out.println("3以上です");
//        }
//	}
	
//	１から10までの乱数を発生させて表示し、5以上ならば、”5以上です”と表示し、そうでなければ、”5未満です”と表示するプログラムを作りなさい。
//	public static void main(String[] args) {
//		int r = new java.util.Random().nextInt(10)+1;
//		System.out.println(r);
//		if (r >= 5) {
//			System.out.println("5以上です");
//		} else {
//			System.out.println("5未満です");
//		}
//	}
	
//	1から10までの乱数を発生させて表示し、その値が1でなければ”１ではありません”と表示し、1であれば、”1です。”と表示するプログラムを作りなさい。
//	public static void main(String[] args) {
//		int r = new java.util.Random().nextInt(10)+1;
//		System.out.println(r);
//		if (r != 1) {
//			System.out.println("1ではありません");
//		} else if (r == 1) {
//			System.out.println("1です");
//		}
//	}
	
//	１から100までの乱数を発生させて表示し、50未満ならば、”50未満です”とそうでなければ、”50以上です”と表示するプログラムを作りなさい。
//	public static void main(String[] args) {
//		int r = new java.util.Random().nextInt(100)+1;
//		System.out.println(r);
//		if (r < 50) {
//			System.out.println("50未満です");
//		} else {
//			System.out.println("50以上です");
//		}
//	}
	
//	1から100までの乱数を発生させて表示し、値が10以下か、90以上なら、”10以下か90以上の値です”と表示し、そうでなければ、”10より大きく90未満です”と表示するプログラムを作りなさい。
//	public static void main(String[] args) {
//		int r = new java.util.Random().nextInt(100)+1;
//		System.out.println(r);
//		if (r <= 10 || r >= 90) {
//			System.out.println("10以下か90以上の値です");
//		} else {
//			System.out.println("10より大きく90未満です");
//		}
//	}
	
//	１から100までの乱数を発生させ、値が20以上80未満であれば、”20以上80未満です”と表示し、そうでなければ、”20未満か、80以上です”と表示するプログラムを作りなさい。
//	public static void main(String[] args) {
//		int r = new java.util.Random().nextInt(100)+1;
//		System.out.println(r);
//		if (r >= 20 && r < 80) {
//			System.out.println("20以上80未満です");
//		} else {
//			System.out.println("20未満か、80以上です");
//		}
//	}
	
//	-10から10までの乱数を発生させて表示し、もしも負の値であれば”負の値です”と表示し、正の値であれば、”正の値です”と表示し、そうでなければ、”0です”と表示するプログラムを作りなさい。
//	public static void main(String[] args) {
////		Math.random()*21 ⇒0-20までの乱数
//		int num = (int)(Math.random()*21) -10;
//		System.out.println(num);
//		if (num < 0) {
//			System.out.println("負の数です");
//		} else if (num > 0) {
//			System.out.println("正の数です");
//		} else {
//			System.out.println("0です");
//		}
//	}
	
//	１から3の乱数を発生させ、１なら、”グー”、2なら、”パー”3なら”チョキ”と表示するプログラムを作りなさい。
//	public static void main(String[] args) {
//		int num = new java.util.Random().nextInt(3)+1;
//		System.out.println(num);
//		if (num == 1) {
//			System.out.println("グー");
//		} else if (num == 2) {
//			System.out.println("チョキ");
//		} else {
//			System.out.println("パー");
//		}
//	}
	
//	１から10までの二つの乱数を発生させ、それぞれa,bという変数に代入して表示し、aのほうが大きければ、”aのほうが大きいです。”と表示し、bのほうが大きければ”bのほうが大きいです。”と表示し、そうでなければ、”等しいです”と表示するプログラムを作りなさい。
//	public static void main(String[] args) {
//		int a = new java.util.Random().nextInt(10)+1;
//		int b = new java.util.Random().nextInt(10)+1;
//		
//		System.out.println(a);
//		System.out.println(b);
//		
//		if (a > b) {
//			System.out.println("aの方が大きいです");
//		} else if (b > a) {
//			System.out.println("bの方が大きいです");
//		} else {
//			System.out.println("等しいです");
//		}
//	}
	
//	１から100までの数値を乱数で発生させて表示し、以下の処理を行いなさい。
//	public static void main(String[] args) {
//		int num = (int)(Math.random()*100)+1;
//		System.out.println("点数：" + num);
////		80点以上なら”優”と表示。
//		if (num >= 80) {
//			System.out.println("優");
////		80点未満、70点以上なら、”良”と表示。
//		} else if (num < 80 && num >= 70) {
//			System.out.println("良");
////		70点未満、60点以上なら、”可”と表示。
//		} else if (num < 70 && num >= 60) {
//			System.out.println("可");
////		60点未満なら、”不可”と表示。
//		} else {
//			System.out.println("不可");
//		}
//	}
	
//	1から100までの数値を乱数で発生させて表示し、以下の処理をしなさい。
//	public static void main(String[] args) {
//		int num = (int)(Math.random()*100)+1;
//		System.out.println(num);
////	2の倍数でもあり、3の倍数でもある場合は、”2と3の公倍数です。”と表示
//		if(num % 2 == 0 && num % 3 == 0) {
//			System.out.println("2と3の公倍数です");
////	2の倍数であるなら、”2の倍数です。”と表示
//		} else if (num % 2 == 0) {
//			System.out.println("2の倍数です");
//		3の倍数であるなら、”3の倍数です。”と表示
//		} else if (num % 3 == 0) {
//			System.out.println("3の倍数です");
//		}
//	}
	
//	1から100までの数値を乱数で発生させ、以下の処理をしなさい。
//	public static void main(String[] args) {
//		int num = (int)(Math.random()*100)+1;
//		System.out.println(num);
////		50以下でかつ偶数の場合、”50以下の偶数です。”と表示。
//		if (num <= 50 && num % 2 == 0) {
//			System.out.println("50以下の偶数です");
////		50以下の場合”50以下です。”と表示。
//		} else if (num <= 50) {
//			System.out.println("50以下です");
////		偶数の場合、”偶数です。”と表示。
//		} else if (num % 2 == 0) {
//			System.out.println("偶数です");
//		}
//	}
	
//	乱数で、－10から35までの乱数を発生させ、”摂氏○○度”（○○が、発生した乱数）と表示させ、その値により、以下のように表示しなさい。
	public static void main(String[] args) {
		int num = (int)(Math.random()*46)-10;
		System.out.println("摂氏" + num + "度");
		
//		30度以上の場合は、”真夏日です。”と表示。
		if (num >= 30) {
			System.out.println("真夏日です");
		} else if (num >= 25 && num < 30) {
			System.out.println("夏日です");
		} else if (num < 0) {
			System.out.println("真冬日です");
		}
	}
	
	
	
	
	
	
	
	
	
	
}
