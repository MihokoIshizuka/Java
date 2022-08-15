package kita_soft;

public class problem_3 {
public static void main(String[] args) {
//	int 型の変数 x、y にそれぞれ数値を入力し、x が y より大きい場合に、“xはyより大きい。”という文を表示するプログラムを作成しなさい。
	System.out.println("Aの数字を入力してください");
	int a = new java.util.Scanner(System.in).nextInt();
	System.out.println("Bの数字を入力してください");
	int b = new java.util.Scanner(System.in).nextInt();
	
	if (a > b) {
		System.out.println("AはBよりも大きいです");
	}
	
//	２つの整数値を入力し、大きい方（小さくない方）の数を表示するプログラムを作成しなさい。
	System.out.println("Aの数字を入力してください");
	int c = new java.util.Scanner(System.in).nextInt();
	System.out.println("Bの数字を入力してください");
	int d = new java.util.Scanner(System.in).nextInt();
	
	if (c > d) {
		System.out.println(c);
	} else if (d > c) {
		System.out.println(d);
	}
	
//	正の整数値を入力し、それが偶数か奇数かを判定するプログラムを作成しなさい。
	System.out.println("正の整数を入力してください");
	int e = new java.util.Scanner(System.in).nextInt();
	if (e % 2 == 0) {
		System.out.println("この数字は偶数です");
	} else {
		System.out.println("この数字は奇数です");
	}

//	試験の点数を入力し、対応する成績を表示するプログラムを作成しなさい。
	System.out.println("中間試験0-100点までの点数を入力してください");
	int f = new java.util.Scanner(System.in).nextInt();
	System.out.println("期末試験0-100点までの点数を入力してください");
	int g = new java.util.Scanner(System.in).nextInt();
	if (f >= 60 && g >= 60) {
		System.out.println("合格");
	} else if ( f + g >= 130) {
		System.out.println("合格");
	} else if (f + g >= 100 && (f >= 90 || g >= 90)) {
		System.out.println("合格");
	} else {
		System.out.println("不合格");
	}
	
//	曜日と、午前、午後、夜間の区別を入力し、病院が開いているか、休診であるかを表示するプログラムを作成しなさい
	System.out.println("曜日を数字で選択してください（0=日曜、1=月曜、2=火曜、3=水曜、4=木曜、5=金曜、6=土曜）");
	int h = new java.util.Scanner(System.in).nextInt();
	System.out.println("時間帯を数字で選択してください（0=午前、1=午後、2=夜間）");
	int i = new java.util.Scanner(System.in).nextInt();
	
	if (h == 1) { 
		System.out.println("休診");
	} else if ((h == 2 && i == 0) || (h == 3 && i == 2) || (h == 5 && i == 0)) {
		System.out.println("休診");
	} else if (h == 6 && (i == 1 || i == 2)) {
		System.out.println("休診");
	} else {
		System.out.println("診療しています");
	}
	
//	整数値 x, y を入力し、以下の条件に該当する場合、そうであることを示す文を表示しなさい。
	System.out.println("xの整数を入力してください");
	int j = new java.util.Scanner(System.in).nextInt();
	System.out.println("yの整数を入力してください");
	int k = new java.util.Scanner(System.in).nextInt();
	
	if (j < k && (j % 2 == 0 && k % 2 == 0)) {
		System.out.println("x は y より小さく、かつ、x と y は共に偶数である。");
	} else if (j == k && j < 0) {
		System.out.println("x と y は等しく、かつ、負の数である。");
	} else if (j < k || j % 2 == 0) {
		System.out.println("x は y より小さい、または、x は偶数である。");
	} else if ((j <= 10 || j > 100) && (k >= 10 && k <= 100)) {
		System.out.println("x は 10 以下または 100 以上で、かつ、y は 10 以上かつ 100 以下である。");
	} else if (j > 0 && k > 0) {
		System.out.println("x も y も負の数である、ではない。");
	}
	
//	月を表す数値を入力し、その月の初めから年末までにある祝日を表示するプログラムを作成しなさい
	System.out.println("1-12まで、月を表す数値を入力してください");
	int l = new java.util.Scanner(System.in).nextInt();
	switch (l) {
	case 1:
		System.out.println("１月：元日、成人の日");
		break;
		
	case 2:
		System.out.println("２月：建国記念の日");
		break;
		
	case 3:
		System.out.println("３月：春分の日");
		break;
		
	case 4:
		System.out.println("４月：昭和の日");
		break;
		
	case 5:
		System.out.println("５月：憲法記念日、みどりの日、こどもの日");
		break;
		
	case 7:
		System.out.println("７月：海の日");
		break;
		
	case 9:
		System.out.println("９月：敬老の日、秋分の日");
		break;
		
	case 10:
		System.out.println("１０月：体育の日");
		break;
		
	case 11:
		System.out.println("１１月：文化の日、勤労感謝の日");
		break;
		
	case 12:
		System.out.println("１２月：天皇誕生日");
		break;
	}
	
//	好きな鮨（すし）を選択させ、それに対応したメッセージを表示する、鮨占いプログラムを作成しなさい。
	System.out.println("好きな鮨を選択し、数値を入力してください。(0=マグロ 1=サーモン 2=つぶ貝 3=はまち 4=いか 5=あなご)");
	int m = new java.util.Scanner(System.in).nextInt();
	switch(m) {
	case 0:
		System.out.println("今日のあなたは大吉！ラッキーカラーはターコイズブルー。");
		break;
		
	case 1:
		System.out.println("今日のあなたは末吉！ラッキーカラーはシルバー。");
		break;
	
	case 2:
		System.out.println("今日のあなたは中吉！ラッキーカラーはパッションピンク。");
		break;
		
	case 3:
		System.out.println("今日のあなたは小吉！ラッキーカラーは藍色。");
		break;
		
	case 4:
		System.out.println("今日のあなたは謎吉！ラッキーカラーは金色。");
		break;
		
	case 5:
		System.out.println("今日のあなたは吉！ラッキーカラーは朱色。");
		break;
	}
	
//	月を表す数値を入力し、その月の日数を表示するプログラムを作成しなさい。2 月は 28 日とします。
//	また、1 ～ 12 以外の数値が入力された場合に、“入力が間違っています”と表示しなさい。
	System.out.println("1-12まで、月を表す数値を入力してください");
	int n = new java.util.Scanner(System.in).nextInt();
	switch(n) {
	case 1:
		System.out.println("1月は31日までです");
		break;
	case 2:
		System.out.println("2月は28日までです");
		break;
	case 3:
		System.out.println("3月は30日までです");
		break;
	case 4:
		System.out.println("4月は30日までです");
		break;
	case 5:
		System.out.println("5月は31日までです");
		break;
	case 6:
		System.out.println("6月は30日までです");
		break;
	case 7:
		System.out.println("7月は31日までです");
		break;
	case 8:
		System.out.println("8月は31日までです");
		break;
	case 9:
		System.out.println("9月は30日までです");
		break;
	case 10:
		System.out.println("10月は31日までです");
		break;
	case 11:
		System.out.println("11月は30日までです");
		break;
	case 12:
		System.out.println("12月は31日までです");
		break;
	default:
		System.out.println("入力が間違っています");
	}
}
}
