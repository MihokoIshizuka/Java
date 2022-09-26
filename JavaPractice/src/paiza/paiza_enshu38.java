package paiza;
import java.util.Scanner;

public class paiza_enshu38 {
	//例外処理 - 具体例：標準入力でプレイヤーを選択する
    public static void main(String[] args) {

        // プレイヤー名を配列で記述する
        String[] players = {"勇者", "戦士", "魔法使い"};
        try {
            // 標準入力から整数を取り込み
            Scanner sc = new Scanner(System.in);
            int num = Integer.parseInt(sc.next());
    
            // 入力値に合わせて、プレイヤー名を表示する
            System.out.println(players[num] + "は、モンスターを倒した！");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("0から" + (players.length - 1) + "を入力してください");
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.err.println("数値を入力してください");
            e.printStackTrace();
        } finally {
            System.out.println("次の冒険が始まった");
        }
    }
}
