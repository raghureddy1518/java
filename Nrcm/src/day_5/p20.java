package day_5;
interface AccountOpertation{
	void balance();
}
class LoanOperation{
	public void applyloan() {
		
	}
}


class AdminOperation extends LoanOperation implements AccountOpertation{
	public void manageaccount() {
		System.out.println("Admin managing customer accounts");
		
	}
	public void applyloan () {
		System.out.println("customer need to apply");
		
	}
	public void balance () {
		System.out.println("your balance is ₹2,00,000 ");
		
	}
	
}
class Transferfunds{
	public void transfer() {
		System.out.println("funds transfered");
	}
}

public class p20 extends Transferfunds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdminOperation a1=new AdminOperation ();
		a1.applyloan();
		a1.balance();
		a1.manageaccount();
		p20 p1=new p20();
		p1.transfer();

	}

}
