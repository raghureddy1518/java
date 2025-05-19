package day_5;
interface Mobiles{
	void type();
	
}
class Sumsung{
	void model() {
		System.out.println(" S23 ultra");
	}
	
}
interface Vivo{
	void price();
}


class Iphone extends Sumsung implements Mobiles,Vivo {
	 public void type() {
		System.out.println("Sumsung ");
		
	}
	void model() {
		System.out.println(" S23 ultra");
	}
	public void price() {
		System.out.println("120000 rs");
	}
	
}

public class p17 extends Iphone {
	public void quality() {
		System.out.println("good camera quality");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p17 p1=new p17();
		p1.type();
		p1.model();
		p1.price();
		p1.quality();
		

	}

}