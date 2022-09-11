package paiza;

import java.util.Scanner;

public class paiza_3 {
//	指定された値が数列に何個含まれているかを求める
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        // 答えを保存する変数を用意して0で初期化
        int num = 0;

        // 配列の全要素をチェックするループを書いて
        for (int value : a) {
        // 要素がkと一致しているか判定して
            if (value == k) {
        // 一致していたら答えをインクリメント
                num++;
            }
        }

        // 答えを出力する
        System.out.println(num);
    }
}
