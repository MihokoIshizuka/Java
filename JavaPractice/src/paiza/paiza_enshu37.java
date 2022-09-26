package paiza;

public class paiza_enshu37 {
	// 例外処理 - 0除算
    public static void main(String[] args) {
        System.out.println("Hello world");
        
        try {
            int number = 0;
            int answer = 100 / number;
            System.out.println(answer);
        } catch (Exception e) {
            // 例外の発生状況を表示させる
            e.printStackTrace();
        } finally {
            System.out.println("Hello Java");
        }
        
    }
}
