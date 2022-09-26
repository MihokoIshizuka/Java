package paiza;
import java.util.Scanner;

//入力した数字分のリスト（要素は2つ）内で、要素同士が同じ数字であれば積を、違う数字であれば和を求める

public class paiza_enshu40 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int[] array = new int[2];
            array[0] = sc.nextInt();
            array[1] = sc.nextInt();
            
            if (array[0] != array[1]) {
                sum += array[0] + array[1];
            } else {
                sum += array[0] * array[1];
            }
        }
        System.out.println(sum);
        
    }
}
