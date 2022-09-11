package paiza;

import java.util.Scanner;

public class paiza_max_min {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt(); 
        }

        int maximum = -100;
        int minimum = 100;

        for(int value : a){
            maximum = Math.max(maximum, value);
            minimum = Math.min(minimum, value);
        }

        System.out.println(maximum + " " + minimum);
    }
}
