package day_5;
class demo15{
	int x=100;
}

public class p11 extends demo15 {
	void add() {
		System.out.println(super.x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p11 p1=new p11();
		p1.add();

	}

}
