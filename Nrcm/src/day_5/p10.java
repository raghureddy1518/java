package day_5;

interface Orderable{
	void placeorder();
	
	
}
interface Deliverable {
	void delivery();
}
interface Discountable extends Orderable,Deliverable{
	void applydiscount();
	
}
class Payment implements Discountable{
	public void delivery() {
		System.out.println("item is deliverable to your address");
	}
	public void applydiscount() {
		System.out.println("discount is 25%");
	}

	public void pay() {
		System.out.println("pay 299rs..");
	}
	public void placeorder() {
		System.out.println("order placed");
	}
}
public class p10 extends Payment{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p10 t1=new p10();
		t1.delivery();
		t1.applydiscount();
		t1.pay();
		t1.placeorder();
		

	}

}
