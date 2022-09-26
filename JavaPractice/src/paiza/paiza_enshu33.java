package paiza;
import java.util.HashMap;

public class paiza_enshu33 {
	// Hashmapを作る
    public static void main(String[] args) {
        
        HashMap<String, String> enemyMap = new HashMap<String, String>();
        enemyMap.put("ザコ", "スライム");
        enemyMap.put("中ボス", "ドラゴン");
        System.out.println(enemyMap.get("ザコ"));
        
//      ザコの上書き
        enemyMap.put("ザコ", "モンスター");
        System.out.println(enemyMap.get("ザコ"));

    }
}
