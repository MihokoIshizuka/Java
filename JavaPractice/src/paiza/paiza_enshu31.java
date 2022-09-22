package paiza;

public class paiza_enshu31 {
	public static void main(String[] args) {
        Box box = new Box();
        box.open();
        
        System.out.println();
        
        JewelryBox jewelrybox = new JewelryBox();
        jewelrybox.look();
        // 子クラスにopen()がなければ親クラスを探して出力してくれる
        jewelrybox.open();

    }
}

class Box {
    public String myItem;
    
    public Box() {
        myItem = "新しいアイテム";
    }
    
    public void open() {
        System.out.println("宝箱を開いた。" + myItem + "を手に入れた。");
    }
}

class JewelryBox extends Box {
    public void look() {
        System.out.println("宝箱はキラキラと輝いている。");
    }
}
