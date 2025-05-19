package day_5;
class chocolate{
	void eat() {
		System.out.println(" eating.....");
	}
}
class dark extends chocolate{
	void taste1() {
		System.out.println("super... ");
		
	}
}
class bornvita extends dark{
	void cost1() {
		System.out.println("50rs");
	}
}
class amul extends dark{
	void cost2() {
		System.out.println("55rs");
		
	}
}
class sweet extends chocolate{
	void taste2() {
		System.out.println("exellent");
	}
}
class dairymilk extends sweet{
	void weight1() {
		System.out.println(" 35 grams");
	}
}
class kitkat extends sweet{
	void weight2() {
		System.out.println("40 grams ");
	}
}

public class p5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bornvita b1=new bornvita ();
		b1.cost1();
		b1.taste1();
		b1.eat();
		dairymilk b2=new dairymilk();
		b2.weight1();
		b2.taste2();
		kitkat b3=new kitkat();
		b3.weight2();
		amul b4=new amul();
		b4.cost2();

	}

}
