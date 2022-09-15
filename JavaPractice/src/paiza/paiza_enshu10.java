package paiza;

import java.util.Scanner;

public class paiza_enshu10 {
//	特定期間の西暦年と昭和年の対応表を作ろう
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int seireki = sc.nextInt();
        int N = sc.nextInt();
        for (int i = seireki; i < (seireki + N); i++) {
            System.out.print("西暦" + i + "年は");
            int shouwa = i - 1925;
            System.out.println("昭和" + shouwa + "年です");
        }
    }
}
