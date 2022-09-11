package paiza;

import java.util.Scanner;

public class paiza_space {
//	スペース区切りで入力すると改行で出力される
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] array = line.split(" ");
            for (String s : array) {
            System.out.println(s);
            }
    }
}
