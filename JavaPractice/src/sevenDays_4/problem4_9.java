package sevenDays_4;

public class problem4_9 {
public static void main(String[] args) {
	while(true) {
		int num = (int)(Math.random()*100)+1;
		System.out.println(num);
		if (num % 10 == 0) {
			break;
		}
	}
	System.out.println("終了します");
}
}
