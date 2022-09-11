package paiza;

import java.util.Scanner;

public class paiza_k_maximum {
//	k番目に大きい値を探索する
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        
        // 最高値の初期化
        int maximum = 100;
        
        // k番目の最高値を求めるためにk回ループを回す
        for (int i = 0; i < k; i++) {
            int nextMaximum = -100;
            
            // 配列を見る
            for (int value : a) {
                // valueがmaximumよりも小さければ、nextMaximumの値を更新
                if (value < maximum) {
                    nextMaximum = Math.max(nextMaximum, value);
                }
            }
            // 初期化したmaximumにnextMaximumを代入
            maximum = nextMaximum;
        }
        System.out.println(maximum);
    
    }
}
