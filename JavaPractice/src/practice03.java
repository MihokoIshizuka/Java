
public class practice03 {
	public static void main(String[] args) {
		
		int[] points = new int[4];
		double[] weights = new double[5];
		boolean[] answers = new boolean[3];
		String[] names = new String[3];
		
//		従来のfor文
		int[] moneyList = { 121902, 8302, 55100 };
		for (int i = 0; i < moneyList.length; i++) {
			System.out.println(moneyList[i]);
		}
//		拡張for文
		int[] moneyLists = { 121902, 8302, 55100 };
		for (int lists : moneyLists) {
			System.out.println(lists);
		}
		
//		数あてクイズ
		int[] numbers = { 3, 4, 9 };
		System.out.println("一桁の数字を入力してください");
		int input = new java.util.Scanner(System.in).nextInt();
		for (int n : numbers) {
			if (n == input) {
				System.out.println("アタリ！");
			}
		}
	}
}
