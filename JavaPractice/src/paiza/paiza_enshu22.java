package paiza;

import java.util.Scanner;

public class paiza_enshu22 {
	 public static void main(String[] args) {
//		 入力として受け取った複数の実数Nを、小数点以下の出力するけた数Mを指定して出力
	        Scanner sc = new Scanner(System.in);
	        int Q = sc. nextInt();
	        double[] N = new double[Q];
	        int[] M = new int[Q];
	        for (int i = 0; i < Q; i++) {
	            N[i] = sc.nextDouble();
	            M[i] = sc.nextInt();
	            System.out.printf("%." + M[i] + "f\n", N[i]);
	        }
	    }
}
