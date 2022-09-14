package paiza;

import java.util.Scanner;

public class paiza_enshu6 {
//	数字を3桁ずつ , で区切る
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String num = sc.next();
        for (int i = 0; i < num.length(); i++) {
            if (i != 0 && i % 3 == 0) {
                System.out.print(",");
            }
            System.out.print(num.charAt(i));
        }
    }
}
