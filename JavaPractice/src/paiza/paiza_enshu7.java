package paiza;

import java.util.Scanner;

public class paiza_enshu7 {
//	出力した数字を端から3桁ずつ , 区切りする
//	ex) 12,345,678,909
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.next();
        int n = line.length() % 3;
        
        for (int i = 0; i < line.length(); i++) {
            if (i % 3 == n && i != 0) {
                System.out.print(",");
            }
            System.out.print(line.charAt(i));
        }
    }
}
