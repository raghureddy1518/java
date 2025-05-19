package day_5;
interface RideBooking {
    void bookRide();
}

interface Payments {
    void makePayment();
}

interface RideManagement {
    void acceptRide();
    
}
interface AdminControl extends RideManagement,Payments, RideBooking{
	void control();
	
} 
class Rider implements AdminControl{
	public void bookRide() {
        System.out.println("Rider booked a ride" );
    }
	public void makePayment() {
        System.out.println("customer made payment of ₹100" );
    }
	 public void acceptRide() {
	        System.out.println("Driver accepted ride");
	    }
	 public void control() {
		 System.out.println("Admin managing users.");
		 
	 }

}


public class p22 extends Rider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p22 t1=new p22();
		t1.bookRide();
		t1.control();
		t1.acceptRide();
		t1.makePayment();

	}

}
