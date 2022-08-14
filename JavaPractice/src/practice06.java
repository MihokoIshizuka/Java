//java言語基本
public class practice06 {
	
//	1から10までの乱数を発生させてそれを画面に表示し、5以上ならば、”5以上です”と表示するプログラムを作りなさい。
//	public static void main(String[] args) {
//		int r = new java.util.Random().nextInt(11);
//		System.out.println(r);
//		if(r >= 5) {
//			System.out.println("5以上です");
//		}
//	}
	
//	1から10までの乱数を発生させてそれを画面に表示し、その値が1でなければ”１ではありません”と表示するプログラムを作りなさい。
//	public static void main(String[] args) {
//		int r = new java.util.Random().nextInt(11);
//		System.out.println(r);
//		if(r != 1) {
//			System.out.println("1ではありません");
//		}
//	}
	
//	1から100までの乱数を発生させてそれを画面に表示し、、50未満ならば、”50未満です”と表示するプログラムを作りなさい。
//	public static void main(String[] args) {
//		int r = new java.util.Random().nextInt(101);
//		System.out.println(r);
//		
//		if(r < 50) {
//			System.out.println("50未満です");
//		}
//	}
	
//	1から100までの乱数を発生させてそれを画面に表示し、値が10以下か、90以上なら、”10以下か90以上の値です”と表示するプログラムを作りなさい。
//	public static void main(String[] args) {
//		int r = new java.util.Random().nextInt(101);
//		System.out.println(r);
//		if(r <= 10 || r >= 90) {
//			System.out.println("10以下か90以上の値です");
//		}
//	}
	
//	1から100までの乱数を発生させてそれを画面に表示し、値が20以上80未満であれば、”20以上80未満です”と表示するプログラムを作りなさい。
//	public static void main(String[] args) {
//		int r = new java.util.Random().nextInt(101);
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
	public static void main(String[] args) {
		int r = new java.util.Random().nextInt(11);
		System.out.println(r);
		if (r >= 5) {
			System.out.println("5以上です");
		} else {
			System.out.println("5未満です");
		}
	}
}
