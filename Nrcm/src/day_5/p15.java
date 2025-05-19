package day_5;
interface Icecreams{
	void flavour();
	
}
class Venilla{
	void taste() {
		System.out.println(" excelent taste..");
	}
	
}
class Chacobar extends Venilla implements Icecreams {
	 public void flavour() {
		System.out.println(" i like  venilla");
		
	}
	void taste() {
		System.out.println(" excelent taste..");
	}
	
	
}

public class p15 extends Chacobar {
	public void price() {
		System.out.println("price is 50 rs");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p15 p1=new p15();
		p1.flavour();
		p1.taste();
		p1.price();
		

	}

}
