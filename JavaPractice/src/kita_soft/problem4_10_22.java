package kita_soft;

import java.util.Scanner;

public class problem4_10_22 {
public static void main(String[] args) {
//	個数を示す数値を入力し、その個数分だけ 0 ～ 9 の数字を表示するプログラムを作成しなさい。数字は 0, 1, 2, 3, , の順に表示し、9 の次は 0 に戻るものとします。
//	Scanner am = new Scanner(System.in);
//	int amount = am.nextInt();
//	int b = 0;
//	for (int a = 0; a < amount; a++) {
//		System.out.print(b++);
//		if (b > 9) {
//			b = 0;
//		}
//	}
	
//	数値を繰り返し入力し、合計が 100 を超えたら入力を止めて合計を表示するプログラムを作成しなさい。
//	Scanner nu = new Scanner(System.in);
//	int total = 0;
//	while (total <= 100) {
//		int number = nu.nextInt();
//		total += number;
//	}
//	System.out.println(total);	
	
//ストライク・カウントを数えるプログラムを作成しなさい。
//１球ごとにストライクかボールかを入力する。
//３ストライクまたは４ボールになったら入力を止め、ストライクとボールのカウントを表示する。
	Scanner scn = new Scanner(System.in);
	int strike = 0;
	int ball = 0;
	while (strike < 3 && ball < 4) {
		System.out.println("ストライク＝１ or ボール＝２ or ファウル＝３　？");
		int count = scn.nextInt();
		if (count == 1) {
			strike += 1;
		} else if (count == 2) {
			ball += 1;
		} else {
			if (count == 3 && strike < 2) {
				strike += 1;
			}
		}
	}
	System.out.println(ball + "ボール、" + strike + "ストライク");
}
}
