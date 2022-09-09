package sevenDays_7;

public class Data {
	public Data() {
		System.out.println("コンストラクタ");
	}
	//  メンバ変数number
    private int number = 0;
    //  メンバ変数comment
    private String comment = "";
    
    
    public void setComment(String comment) {
    	this.comment = comment;
    }
    
    public void setNumber(int number) {
    	this.number = number;
    }
    
    public int getNumber() {
    	return this.number;
    }
    
    public String getComment() {
    	return this.comment;
    }
}
