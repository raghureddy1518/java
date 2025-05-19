package day_5;
class movies{
	void type() {
		System.out.println("hit3..");
	}
}
class hit extends movies {
	void action() {
		System.out.println("thrillerr...");
		
	}
	
}
class hero extends hit{
	void name() {
		System.out.println("natural star");
	}
}
class heroine extends hit{
	void acting(){
System.out.println("superr...")	;	
	}
}

public class p4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hero h1=new hero();
		h1.type();
		h1.action();
		h1.name();
		heroine h2=new heroine ();
		h2.acting();

	}

}
