package kita_soft;

import java.util.Scanner;

public class problem4_17_22 {
public static void main(String[] args) {
//	九九表（一の段～九の段）を表示するプログラムを作成しなさい。
//	for (int a = 1; a <= 9; a++) {
//		for (int b = 1; b <= 9; b++) {
//			System.out.printf("%2d",a * b);
//			if (b == 9) {
//				System.out.println();
//			}
//		}
//	}
	
//	数値を繰り返して入力し、0 が入力されたら入力を止め、それまでの合計を表示するプログラムを作成しなさい
//	Scanner scan = new Scanner(System.in);
//	int num = 1;
//	while (true) {
//		num = scan.nextInt();
//		if (num == 0)
//			break;
//	}
//	System.out.println("終了");
	
//	数値を繰り返して入力し、0 が入力されたら入力を止め、平均値を表示するプログラムを作成しなさい。
//	Scanner scn = new Scanner(System.in);
//	int sum = 0;
//	int count = 0;
//	while (true) {
//		int number = scn.nextInt();
//		if (number != 0) {
//			sum += number;
//			count++;
//		} else {
//			break;
//		}
//	}
//	System.out.println("終了");
//	System.out.println(sum / count);
	
//	サイズを示す数値を入力し、何等かの文字で例のような三角形を表示するプログラムを作成しなさい。
	Scanner s = new Scanner(System.in);
	int size = s.nextInt();
		for (int c = 1; c <= size; c++) {
			for (int d = 1; d <= c; d++) {
				System.out.print("$");
			}
			System.out.println();
		}
	}
}

