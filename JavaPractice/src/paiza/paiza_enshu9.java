package paiza;

public class paiza_enshu9 {
//	西暦昭和の対応表
	public static void main(String[] args) {
        for (int seireki = 1926; seireki <= 1988; seireki++) {
            int shouwa = seireki - 1925;
            System.out.print("西暦" + seireki + "年は");
            System.out.println("昭和" + shouwa + "年です");
        }
    }
}
