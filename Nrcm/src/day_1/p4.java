package day_1;

public class p4 {
	static int r=10,l=30,b=40;
	int s=10;
	void areaofcircle() {
		System.out.println(3.14*r*r);
		
	}
	static void areaofrect() {
		System.out.println(l*b);
	}
	void areaofsquare() {
		System.out.println(s*s);
		
	}
	static void areaoftri() {
		System.out.println(0.5*l*b);
	}	
	public static void main(String[] args) {
	p4 a1=new p4();
	a1.areaofcircle();
	areaofrect();
	a1.areaofsquare();
    areaoftri();

	}

}
