package paiza;
import java.util.Scanner;

public class paiza_enshu25 {
//	ペアの数値の入った表を罫線入りで出力
	 public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
	       int H = sc.nextInt();
	       int W = sc.nextInt();
	       int A = sc.nextInt();
	       int B = sc.nextInt();
	       for (int a = 0; a < H; a++) {
	           for (int b = 0; b < W; b++) {
	               System.out.printf("(%d, %d)", A, B);
	               if (b == W -1) {
	                   System.out.println();
	                   if (a != H - 1) {
//	                	   上の行の文字数分＝を出力
	                       for (int j = 0; j < 6 * W + 3 * (W - 1); j++) {
	                            System.out.print("=");
	                       }
	                       System.out.println();
	                   }
	               } else {
	                   System.out.print(" | ");
	               }
	           }
	       }
	    }
}
