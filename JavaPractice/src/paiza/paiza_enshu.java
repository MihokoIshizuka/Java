package paiza;

import java.util.Scanner;

public class paiza_enshu {
	 public static void main(String[] args) {
//	       N行M列のデータ入力
	        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        for (int i = 0; i < N; i++) {
	            int M = sc.nextInt();
	            for (int j = 0; j < M; j++) {
	                int a = sc.nextInt();
	                System.out.print(a);
	                if (j < M - 1) {
	                    System.out.print(" ");
	                } else {
	                   System.out.println(); 
	                }
	                
	            }
	        }
	       
	    }
}
