//java言語基本
public class practice06 {
	
//	1-10の乱数を発生させ、5以上ならば5以上ですと表示させる
//	public static void main(String[] args) {
//		int r = new java.util.Random().nextInt(11);
//		System.out.println(r);
//		if(r >= 5) {
//			System.out.println("5以上です");
//		}
//	}
	
//	1-10の乱数を発生させて表示し、その値が1でなければ1でないと表示させる
	public static void main(String[] args) {
		int r = new java.util.Random().nextInt(11);
		System.out.println(r);
		if(r != 1) {
			System.out.println("1ではありません");
		}
	}
	
}
