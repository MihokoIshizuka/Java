package paiza;

import java.util.Scanner;

public class paiza_enshu13 {
//	カンマ区切りで配列に複数行データを読み込む
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            // ここに、文字列を分割して、出力するコードを書く
            String[] enemy = line.split(",");
            System.out.println(enemy[0] + "が" + enemy[1] + "匹現れた");
        }
    }

}
