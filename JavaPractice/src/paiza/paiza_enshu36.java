package paiza;
import java.util.HashMap;
import java.util.Map.Entry;

public class paiza_enshu36 {
	// ループでマップの値を出力しよう
    public static void main(String[] args) {
        HashMap<String, Integer> points = new HashMap<String, Integer>();
        points.put("国語", 51);
        points.put("算数", 35);
        points.put("英語", 52);
        points.put("理科", 19);
        int num = 0;
        // この下で、ハッシュの値の合計をループで計算する
        for (Entry<String, Integer> entry : points.entrySet()) {
            num += entry.getValue();
        }
        System.out.println(num);

    }
}
