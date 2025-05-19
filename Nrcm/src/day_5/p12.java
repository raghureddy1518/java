package day_5;
class demo16{
	int x=100;
	int y=10;
	public void add() {
		System.out.println(x+y);
	}
}

public class p12 extends demo16 {
	void sub() {
		super.add();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p12 p1=new p12();
		p1.sub();

	}

}
