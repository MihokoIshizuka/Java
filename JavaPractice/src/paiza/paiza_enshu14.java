package paiza;

import java.util.Scanner;

public class paiza_enshu14 {
//	じゃんけんプログラム
	public static void main(String[] args) {
        // 標準入力から1行取得
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();


        // カンマで分割して、配列に代入
        String[] janken = line.split(",");


        // 配列の要素をランダムに選ぶ
        int num = (int)Math.random() * janken.length;


        // ランダムに選んだ配列の要素を出力
        System.out.println(janken[num]);
        
    }

}
