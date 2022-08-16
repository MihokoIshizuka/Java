package kita_soft;

import java.util.Scanner;

public class problem_4 {
public static void main(String[] args) {
	
//	“SPAM”という単語を 10 回表示するプログラムを作成しなさい。
//	String spam = "SPAM";	
//	for (int i = 0; i < 10; i++) {
//		System.out.println(spam);
//	}
	
//	九九、三の段（ 3 ～ 27 の 3 の倍数）を表示するプログラムを作成しなさい。
//	int num = 3;
//	for (int a = 1; a < 10; a++) {
//		int result = num * a;
//		System.out.println(result);
//	}
	
//	2 の 1 乗から 8 乗までを計算し表示するプログラムを作成しなさい。
//	int b = 1;
//	for (int c = 1; c < 9; c++) {
//		b *= 2;
//		System.out.println(b);
//		
//	}
	
//	7 の階乗を計算し、表示するプログラムを作成しなさい
//	int c = 1;
//	for (int d = 1; d <= 7; d++) {
//		c *= d;
//	}
//	System.out.println(c);
	
//	整数を 10 回入力し、平均値を求めるプログラムを作成しなさい
//	Scanner scanner = new Scanner(System.in);
//	int sum = 0;
//	for (int d = 1; d <= 10; d++) {
//		sum += scanner.nextInt();
//	}
//	System.out.println(sum / 10);
	
//	整数、0 か 1 を 10 回入力する。これを対戦成績と考え、0 を負け、1 を勝ちとして、勝ちの総数、負けの総数を表示するプログラムを作成しなさい。
	Scanner scanner = new Scanner(System.in);
	int win = 0;
	for (int e = 0; e < 10; e ++) {
		int end = scanner.nextInt();
		if (end == 1) {
			win += 1;
		}
	}
	System.out.println("勝ち：" + win + "回、負け：" + (10 - win) + "回");
}
}
