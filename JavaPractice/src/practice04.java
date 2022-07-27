
public class practice04 {
	
//	練習問題
//	public static void main(String[] args) {
//		introduceOneself();
//	}
//	public static void introduceOneself() {
//		String name = "イシヅカ";
//		int age = 26;
//		double height = 152.3;
//		char eto = '亥';
//		
//		System.out.println("私の名前は" + name + "です");
//		System.out.println("年齢は" + age + "です");
//		System.out.println("身長は" + height + "です");
//		System.out.println("干支は" + eto + "です");
//	}
//	
//	public static void main(String[] args) {
//		String title = "お知らせ";
//		String address = "test@com";
//		String text = "お茶会のお知らせです";
//		email(title, address, text);
//	}
//	public static void email(String title, String address, String text) {
//		System.out.println(address + "に、以下のメールを送信しました");
//		System.out.println("件名：" + title);
//		System.out.println("本文：" + text);
//	}
//	
//	public static void email(String address, String text) {
//		System.out.println(address + "に、以下のメールを送信しました");
//		System.out.println("件名：無題");
//		System.out.println("本文：" + text);
//	}
	
	public static void main(String[] args) {
		double triangleArea = calcTriangleArea(10.0, 5.0);
		System.out.println("三角形の面積：" + triangleArea);
		double circleArea = calcCircleArea(5.0);
		System.out.println("円の面積：" + circleArea);
	}
	public static double calcTriangleArea(double bottom, double height) {
		double area = (bottom * height) / 2;
		return area;
	}
	public static double calcCircleArea(double radius) {
		double area = radius * radius * 3.14;
		return area;
	}
}
