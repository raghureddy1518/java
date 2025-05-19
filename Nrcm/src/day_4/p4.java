package day_4;

public class p4 {
	
	int a,b;
	public  p4(int a, int b) {
		this.a=a;
		this.b=b;
		System.out.println(a+b);
	}
	public  p4(p4 t1) {
		this.a=t1.a;
		this.b=t1.b;
		System.out.println(a-b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p4 t1=new p4(12,13);
		p4 t5=new p4(t1);

	}

}
