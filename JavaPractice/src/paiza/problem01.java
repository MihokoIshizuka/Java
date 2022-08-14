package paiza;

public class problem01 {
//	文字列でHelloを入力すると、こんにちはのメッセージを表示する
	public static void main(String[] args) {
		String s = new java.util.Scanner(System.in).nextLine();
		if (s.equals("Hello")) {
			System.out.println("こんにちは");
		}
	}
}
