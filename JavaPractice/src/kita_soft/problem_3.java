package kita_soft;

public class problem_3 {
public static void main(String[] args) {
////	int 型の変数 x、y にそれぞれ数値を入力し、x が y より大きい場合に、“xはyより大きい。”という文を表示するプログラムを作成しなさい。
//	System.out.println("Aの数字を入力してください");
//	int a = new java.util.Scanner(System.in).nextInt();
//	System.out.println("Bの数字を入力してください");
//	int b = new java.util.Scanner(System.in).nextInt();
//	
//	if (a > b) {
//		System.out.println("AはBよりも大きいです");
//	}
//	
////	２つの整数値を入力し、大きい方（小さくない方）の数を表示するプログラムを作成しなさい。
//	System.out.println("Aの数字を入力してください");
//	int c = new java.util.Scanner(System.in).nextInt();
//	System.out.println("Bの数字を入力してください");
//	int d = new java.util.Scanner(System.in).nextInt();
//	
//	if (c > d) {
//		System.out.println(c);
//	} else if (d > c) {
//		System.out.println(d);
//	}
	
////	正の整数値を入力し、それが偶数か奇数かを判定するプログラムを作成しなさい。
//	System.out.println("正の整数を入力してください");
//	int e = new java.util.Scanner(System.in).nextInt();
//	if (e % 2 == 0) {
//		System.out.println("この数字は偶数です");
//	} else {
//		System.out.println("この数字は奇数です");
//	}

//	試験の点数を入力し、対応する成績を表示するプログラムを作成しなさい。
//	System.out.println("中間試験0-100点までの点数を入力してください");
//	int f = new java.util.Scanner(System.in).nextInt();
//	System.out.println("期末試験0-100点までの点数を入力してください");
//	int g = new java.util.Scanner(System.in).nextInt();
//	if (f >= 60 && g >= 60) {
//		System.out.println("合格");
//	} else if ( f + g >= 130) {
//		System.out.println("合格");
//	} else if (f + g >= 100 && (f >= 90 || g >= 90)) {
//		System.out.println("合格");
//	} else {
//		System.out.println("不合格");
//	}
	
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
}
}
