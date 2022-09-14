package paiza;

import java.util.Scanner;
//出力時に数字を , で区切る
public class paiza_enshu5 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[2];
        for (int i = 0; i < 2; i++) {
            num[i] = sc.nextInt();
        }
        for (int i = 0; i < 2; i++) {
            System.out.print(num[i]);
            if (i < 1) {
                System.out.print(",");
            } else {
                System.out.println();
            }
        }
    }
}
