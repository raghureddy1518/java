package day_5;
class fruits{
	void benifits() {
		System.out.println( "healthy...");
	}
}
class apple extends fruits{
	void color() {
		System.out.println("red color");
		
	}
}
class banana extends fruits{
	void taste() {
		System.out.println("sweet...");
	}
}
class mango extends fruits {
	void price() {
		System.out.println("100 per kg");
	}
	
}
public class p3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		apple b1=new apple();
		b1.color();
		b1.benifits();
		banana b2=new banana ();
		b2.taste();
		mango b3=new mango();
		b3.price();

	}

}
