package paiza;

public class paiza_enshu17 {
//	ドット絵
	public static void main(String[] args) {

        int[][] enemyImage =
            {{0,0,0,0,1,0,0,0,0,0,0,1,0,0,0,0},
             {0,0,0,1,0,1,0,0,0,0,1,1,1,0,0,0},
             {0,0,1,0,0,0,0,1,1,1,1,1,1,1,0,0},
             {1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1},
             {1,0,0,1,1,1,0,0,0,0,1,1,1,0,0,1},
             {1,1,0,0,0,0,0,1,1,0,0,0,0,0,1,1},
             {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0}};
             
        for (int[] line : enemyImage) {
            for (int dot : line) {
                if (dot == 1) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

}
