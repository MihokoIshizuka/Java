package kita_soft;

import java.util.Scanner;

public class problem_4_1_10 {
public static void main(String[] args) {
	
//	“SPAM”という単語を 10 回表示するプログラムを作成しなさい。
	String spam = "SPAM";	
	for (int i = 0; i < 10; i++) {
		System.out.println(spam);
	}
	
//	九九、三の段（ 3 ～ 27 の 3 の倍数）を表示するプログラムを作成しなさい。
	int num = 3;
	for (int a = 1; a < 10; a++) {
		int result = num * a;
		System.out.println(result);
	}
	
//	2 の 1 乗から 8 乗までを計算し表示するプログラムを作成しなさい。
	int b = 1;
	for (int c = 1; c < 9; c++) {
		b *= 2;
		System.out.println(b);
		
	}
	
//	7 の階乗を計算し、表示するプログラムを作成しなさい
	int c = 1;
	for (int d = 1; d <= 7; d++) {
		c *= d;
	}
	System.out.println(c);
	
//	整数を 10 回入力し、平均値を求めるプログラムを作成しなさい
	Scanner scanner = new Scanner(System.in);
	int sum = 0;
	for (int d = 1; d <= 10; d++) {
		sum += scanner.nextInt();
	}
	System.out.println(sum / 10);
	
//	整数、0 か 1 を 10 回入力する。これを対戦成績と考え、0 を負け、1 を勝ちとして、勝ちの総数、負けの総数を表示するプログラムを作成しなさい。
	Scanner scan = new Scanner(System.in);
	int win = 0;
	for (int e = 0; e < 10; e ++) {
		int end = scan.nextInt();
		if (end == 1) {
			win += 1;
		}
	}
	System.out.println("勝ち：" + win + "回、負け：" + (10 - win) + "回");
	
//	次のプログラムを作成しなさい。
//	巨人、阪神戦で毎回の得点を入力する。（１回～９回）
//	入力が終わったら、それぞれの得点とどちらが勝ったかを表示する。
	Scanner sc = new Scanner(System.in);
	int kyojinTotal = 0;
	int hanshinTotal = 0;
	for (int f = 1; f <= 9; f++) {
		System.out.println(f + "回表の巨人の点数");
		int kyojin = sc.nextInt();
		System.out.println(f + "回裏の阪神の点数");
		int hanshin = sc.nextInt();
		if(kyojin > 0) {
			kyojinTotal += kyojin;
		} 
		if (hanshin > 0) {
			hanshinTotal += hanshin;
		}
	}
	System.out.println("巨人：" + kyojinTotal + "点、阪神：" + hanshinTotal + "点");
	if (kyojinTotal > hanshinTotal) {
		System.out.println("巨人の勝ち");
	} else if (hanshinTotal > kyojinTotal) {
		System.out.println("阪神の勝ち");
	} 
	
//	自然数（正の整数）を 10 回入力し、最大値を求めるプログラムを作成しなさい。
//	整数を 10 回入力し、最大値と最小値を求めるプログラムを作成しなさい。
	Scanner scn = new Scanner(System.in);
	int max = 0;
	int min = 0;
	for (int g = 0; g < 10; g++) {
		int nu = scn.nextInt();
		if (g == 0) {
			max = nu;
			min = nu;
		} else {
			if (nu > max)
				max = nu;
			if (nu < min)
				min = nu;
		}
	}
	System.out.println("最大値" + max + "、最小値" + min);
	
//	個数を示す数値を入力し、その個数分だけ‘*’を表示するプログラムを作成しなさい。
	Scanner am = new Scanner(System.in);
	int amount = am.nextInt();
	for (int h = 0; h < amount; h++) {
		System.out.print("*");
	}
	
}
}
