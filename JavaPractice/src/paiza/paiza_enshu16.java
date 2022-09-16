package paiza;

public class paiza_enshu16 {
//	2次元配列のループ処理
	public static void main(String[] args) {
        String[][] teams = {{"勇者", "戦士", "魔法使い"}, {"盗賊", "忍者", "商人"}, {"スライム", "ドラゴン", "魔王"}};
        
        for (int i = 0; i < teams.length; i++) {
            for (int j = 0; j < teams[i].length; j++) {
                System.out.print(teams[i][j] + " ");
            }
        }
        System.out.println();
        
//      同じ結果になる
        for (String[] team :teams) {
            for (String player : team) {
                System.out.print(player +  " ");
            }
        }

    }

}
