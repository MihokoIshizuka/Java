package paiza;

public class paiza_enshu24 {
	public static void main(String[] args) {
        // 九九表を線入りで出力
        for (int a = 1; a <= 9; a++) {
            for (int b = 1; b <= 9; b++) {
                System.out.printf("%2s", a * b);
                if (b == 9) {
                    System.out.println();
                    if (a != 9) {
                        System.out.println("==========================================");
                    }
                } else {
                    System.out.print(" | ");
                }
            }
        }
    }
}
