package sevenDays_7;

public class paiza_enshu4 {
//	サイコロの目をランダムで表示させる
	public static void main(String[] args) {
		double rand = Math.random() *6 + 1;
//		double型からint型へ変換
		int number = (int)rand;
		System.out.println("サイコロの目は" + number + "です");
	}
}
