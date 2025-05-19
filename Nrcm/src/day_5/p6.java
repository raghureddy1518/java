package day_5;

public class p6 {
	void show() {
		System.out.println("good morning");
		
	}
	void show(int a,int b) {
		System.out.println(a+b);
		
	}
	void show(double a,double b) {
		System.out.println(a-b);
		
	}

	void show(String a,String b) {
		System.out.println(a+b);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p6 p=new p6();
		p.show();
		p.show(10,20);
		p.show(20.8,10.8);
		p.show("raghu ","reddy");
		

	}

}
