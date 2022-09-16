package paiza;

public class paiza_enshu12 {
	public static void main(String[] args) {
        String player_1 = "勇者";
        String player_2 = "魔法使い";
        String player_3 = "戦士";
        // player_1 ~ 3を、配列に代入して、printlnメソッドで出力してください。
        String[] players = {player_1, player_2, player_3};
        for (String value : players) {
            System.out.println(value);
        }
    }
}
