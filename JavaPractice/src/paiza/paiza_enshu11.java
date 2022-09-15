package paiza;

import java.util.Scanner;

public class paiza_enshu11 {
//	数列 A の値を B_1 個、B_2個、... B_M 個で分割し、それぞれの数列を改行区切りで出力してください。
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int M = sc.nextInt();
        int[] B = new int[M];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        for (int j = 0; j < M; j++) {
            B[j] = sc.nextInt();
        }
        int nextIndex = 0;
        for (int value : B) {
            for (int i = 0; i < value; i++) {
                System.out.print(A[nextIndex]);
                    if (i < value -1) {
                        System.out.print(" ");
                    } else {
                        System.out.println();
                    }
                nextIndex++;
            }
        }
        
    }
}
