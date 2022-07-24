
public class practice01 {
	public static void main(String[] args) {
		String age = "31";
//		stringをintに変換する
		int n = Integer.parseInt(age);
		System.out.println("あなたは来年" + (n + 1) + "歳になりますね");
		
//		90未満(0-89)の数字をランダムに代入する
		int r = new java.util.Random().nextInt(90);
		System.out.println("あなたは多分" + r + "歳ですね？");
		
		System.out.println("あなたの名前を入力してください");
		String name = new java.util.Scanner(System.in).nextLine();
		System.out.println("あなたの年齢を入力してください");
		int yourage = new java.util.Scanner(System.in).nextInt();
		System.out.println("ようこそ" + yourage + "歳の" + name + "さん");
		
	}		
}
