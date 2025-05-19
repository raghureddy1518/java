package day_5;
interface Sweets{
	void type();
	
}
class Laddu{
	void taste() {
		System.out.println(" not bad ......");
	}
	
}
interface Kova{
	void price();
}


class Gulabjam extends Laddu implements Sweets,Kova {
	 public void type() {
		System.out.println(" sweet");
		
	}
	void taste() {
		System.out.println(" excelent taste..");
	}
	public void price() {
		System.out.println("price is 60 rs..");
	}
	
}

public class p16 extends Gulabjam {
	public void quality() {
		System.out.println("good quality..");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p16 p1=new p16();
		p1.type();
		p1.taste();
		p1.price();
		p1.quality();
		

	}

}
