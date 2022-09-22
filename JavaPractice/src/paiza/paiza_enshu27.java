package paiza;

public class paiza_enshu27 {
	 public static void main(String[] args) {
	        String[] enemies = {"スライム", "モンスター", "ドラゴン"};
	        for (String enemy : enemies) {
	            attack(enemy);
	        }
	    }
	    
	    public static void attack(String target) {
	        System.out.println("勇者は" + target + "を攻撃した。");
	        int hit = (int) (Math.random() * 10 + 1);
	        if (hit < 6) {
	            System.out.println(target + "に、" + hit + "のダメージを与えた！");
	        } else {
	            System.out.println("クリティカルヒット！" + target + "に、100のダメージを与えた！");
	        }
	    }
}
