package day_6;



public class p6 {
	void show () {
		System.out.println("hiii...");
	
	class test{
		void add() {
			System.out.println("helloo");
		}
	}
	test t2 =new test();
	t2.add();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		p5 t1 =new p5();
		t1.show();
	
		p5.test t2=new p5().new test();
		t2.add();
	}

}