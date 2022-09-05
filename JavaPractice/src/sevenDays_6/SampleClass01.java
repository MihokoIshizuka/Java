package sevenDays_6;

public class SampleClass01 {
	int n = 10;
	String s = "field";
	
	int add(int a, int b){
		return a + b;
	}
	String add(String s) {
//		this.sはフィールドのs、何もついていないsは、この引数のs
		return this.s + s;
	}
	void showNum() {
		System.out.println("n = " + n);
	}
	
}
