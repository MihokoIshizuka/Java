package paiza;

import java.util.Scanner;

public class C023 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] atari = new int[6];
        int atariCount = 0;
        for (int i = 0; i < 6; i++) {
            atari[i] = sc.nextInt();
        }
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int[] kuji = new int[6];
            for (int j = 0; j < 6; j++) {
                kuji[j] = sc.nextInt();
            }
            for (int valueAtari : atari) {
            	for (int valueKuji :kuji) {
            		if (valueAtari == valueKuji) {
            			atariCount += 1;
            		}
            	}
            }
            System.out.println(atariCount);
            atariCount = 0;
        }
    }
}
