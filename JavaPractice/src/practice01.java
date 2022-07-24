
public class practice01 {
	public static void main(String[] args) {
		String age = "31";
//		stringをintに変換する
		int n = Integer.parseInt(age);
		System.out.println("あなたは来年" + (n + 1) + "歳になりますね");
		
//		乱数の生成・90未満(0-89)の数字をランダムに代入する
		int r = new java.util.Random().nextInt(90);
		System.out.println("あなたは多分" + r + "歳ですね？");
		
		System.out.println("あなたの名前を入力してください");
//		キーボードから1行の文字列の入力を受け付ける
		String name = new java.util.Scanner(System.in).nextLine();
		System.out.println("あなたの年齢を入力してください");
//		キーボードから１つの整数の入力を受け付ける
		int yourage = new java.util.Scanner(System.in).nextInt();
		System.out.println("ようこそ" + yourage + "歳の" + name + "さん");
		
		
		System.out.println("ようこそ、占いの館へ");
		System.out.println("あなたの名前を入力してください");
		String yourname = new java.util.Scanner(System.in).nextLine();
		System.out.println("あなたの年齢を入力してください");
		String youage = new java.util.Scanner(System.in).nextLine();
		int y = Integer.parseInt(youage);
		int fortune = new java.util.Random().nextInt(4);
		fortune++;
		System.out.println("占いの結果が出ました！");
		System.out.println(y + "歳の" + yourname + "さん、あなたの運気番号は" + fortune + "です。");
		System.out.println("1:大吉　2:中吉　3:吉　4:凶");
		
		
	}		
}
