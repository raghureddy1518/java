package day_1;

public class logic {
	static int p=10,q=30;
	int a=10,b=20;
	void and() {
		System.out.println((a<b)&&(b<a));
	}
	void or() {
		System.out.println((p<q)||(q<p));
	}
	 static void not() {
		//int x=10,y=20;
		System.out.println(!(p>q));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		logic a1=new logic();
		a1.and();
		a1.or();
		a1.not();
		

	}

}
