package day_3;

abstract class raghu {
	abstract void sumsub();
	 static void mul() {
		 int a=10,b=20;
		 System.out.println(a*b);
	 }
	 void divmod() {
		 int a=10,b=20;
		 System.out.println(a/b);
		 System.out.println(a%b);
		 
	 }
}
class p11 extends raghu{
	public void sumsub()
	{ int a=10,b=20;
		System.out.println("sum:" + (a+b));
		System.out.println(a-b);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p11 d1=new p11();
		d1.sumsub();
		raghu.mul();
		d1.divmod();
	

	}

}
