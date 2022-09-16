package paiza;

public class paiza_enshu18 {
//	3次元配列のドット絵
	public static void main(String[] args) {

        int[][][] letters =
            {{{0,0,1,1,0,0},
             {0,1,0,0,1,0},
             {1,0,0,0,0,1},
             {1,1,1,1,1,1},
             {1,0,0,0,0,1},
             {1,0,0,0,0,1}},
            {{1,1,1,1,1,0},
             {1,0,0,0,0,1},
             {1,1,1,1,1,0},
             {1,0,0,0,0,1},
             {1,0,0,0,0,1},
             {1,1,1,1,1,0}},
            {{0,1,1,1,1,0},
             {1,0,0,0,0,1},
             {1,0,0,0,0,0},
             {1,0,0,0,0,0},
             {1,0,0,0,0,1},
             {0,1,1,1,1,0}}};

        // ここに、ドットを表示するコードを記述する
        for (int[][] img : letters) {
            for (int[] line : img) {
                for (int dot : line) {
                    if (dot == 1) {
                        System.out.print("@");
                    } else {
                    	System.out.print(" ");
                    }
                }
                System.out.println();
            } 
            System.out.println();
        }
    }

}
