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
//	Scanner scn = new Scanner(System.in);
//	int strike = 0;
//	int ball = 0;
//	while (strike < 3 && ball < 4) {
//		System.out.println("ストライク＝１ or ボール＝２ or ファウル＝３　？");
//		int count = scn.nextInt();
//		if (count == 1) {
//			strike += 1;
//		} else if (count == 2) {
//			ball += 1;
//		} else {
//			if (count == 3 && strike < 2) {
//				strike += 1;
//			}
//		}
//	}
//	System.out.println(ball + "ボール、" + strike + "ストライク");
	
//	入力された数が素数かどうかを判定するプログラムを作成しなさい。
//	Scanner s = new Scanner(System.in);
//	int sosuu = s.nextInt();
//	boolean judge = true;
//	for (int c = 2; c < sosuu; c++) {
//		if (sosuu % c == 0) { 		
//			judge = false;
//			break;
//		}
//	}
//	if (judge) {
//		System.out.println("この値は素数です");		
//	} else {
//		System.out.println("この値は素数ではありません");
//	}
	
//	2 以上の数値を入力し、素因数分解した結果を表示しなさい。
	Scanner sc = new Scanner(System.in);
	int soin = sc.nextInt();
//		↓最小の素数
	int d = 2;
	while (true) {
//		↓もしも最小の素数2で割り切れたら表示する
		if (soin % d == 0) {
			System.out.print(d + " ");
//		↓soinは2で割った商に数値を更新する
			soin /= d;
//		↓最終的に商が1になったら終了
			if (soin == 1)
				break;
		} else {
			d++;
		}
	}
}
}
