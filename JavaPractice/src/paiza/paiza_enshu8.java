package paiza;

import java.util.Scanner;

public class paiza_enshu8 {
//	1つ目の数値から２つ目の数値までを、1ずつ増加させながら、1行ずつ順番に出力するプログラムを作成してください。
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[2];
        for (int i = 0; i < 2; i++) {
            num[i] = sc.nextInt();
        }
        for (int i = num[0]; i <= num[1]; i++) {
            System.out.println(i);
        }

    }
}
