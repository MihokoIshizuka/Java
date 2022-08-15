package kita_soft;

public class problem_1 {
	public static void main(String[] args) {
//	“Hello World”と表示するプログラムを作成しなさい。
		System.out.println("Hello World");
		
//	int 型の変数 x に数値 11 を代入し、x の値を“x=11”のように表示するプログラムを作成しなさい。
		int x = 11;
		System.out.println("x = " + x);
		
//	int 型の変数 x、y に数値 13、17 を代入し、x、y の値を“x=13,y=17”のように表示するプログラムを作成しなさい。
		int a = 13;
		int b = 17;
		System.out.println("x =" + a + ", y =" + b);
		
//	int 型の変数 x に数値 13 と 17 の和を代入し、x の値を表示するプログラムを作成しなさい。
		int add = a + b;
		System.out.println(add);
		
//	数値 13 と 17 の積を表示するプログラムを作成しなさい。ただし、変数を使用しないこと。
		System.out.println(a * b);
		
//	次のプログラムを作成しなさい。
//	int 型の変数 x に数値 7 を代入する。
		int c =7;
//	変数 x の値を 3 倍にし、変数 x の値を表示する。
		c *= 3;
		System.out.println(c);
//	変数 x の値を半分（1/2）にし、変数 x の値を表示する。
		c /= 2;
		System.out.println(c);
		
//	int 型の変数 x、y に任意の数値を代入し、x の値を y に、y の値を x に入れ替えて x と y の値を表示するプログラムを作成しなさい。
		int d = 3;
		int e = 7;
		
		int f = d;
		d = e;
		e = f;
		System.out.println("d=" + d + ", e=" + e);
		
//	int 型の変数 x、y に数値 19、23 を代入し、その積を変数 z に代入して z の値を表示するプログラムを作成しなさい。
		int g = 19;
		int h = 23;
		int i = g * h;
		System.out.println(i);
		
//	int 型の変数 x に任意の数値を代入し、x を 2 倍、3 倍、4 倍した結果を表示するプログラムを作成しなさい。
		int j = 3;
		int k = 4;
		int result = 3;
		for (int l = 1; l <= k; l++) {
			result = j * l;
			System.out.println(result);
		}
//	int 型の変数 x に任意の数値を代入し、x を 1 乗、2 乗、3 乗した結果を表示するプログラムを作成しなさい。
		int m = 3;
		int n = 3;
		int math = 1;
		for (int l = 0; l < n; l++) {
			math *= m;		
			System.out.println(math);
		}
		
//	int 型の変数 x に任意の数値を代入し、x を x より小さい任意の数値で割った商と余りを表示するプログラムを作成しなさい。
		int o = 10;
		for (int p = 1; p < o; p++) {
			int waru = o / p;
			int amari = o % p;
			System.out.println("商：" + waru + ", 余り：" + amari);
		}
//	int 型の変数 x に任意の数値を代入し、インクリメント演算子、デクリメント演算子を適用して結果を表示することにより演算子の効果を確認するプログラムを作成しなさい。		int q = 0;
		for (int r = 0; r < 10; r++) {
			System.out.println(r);
		}
		for (int r =10; r >= 0; r--) {
			System.out.println(r);
		}
		
		
	}
}
