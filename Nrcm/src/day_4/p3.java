package day_4;

public class p3 {
	int a,b;
	public p3(int x,int y)
	{
		a=x;
	 b=y;
		System.out.println(a+b);
	}
	public void add() {
		this.a=a;
		this.b=b;
		System.out.println(a-b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
p3 d= new p3(12,10);
d.add();

	}

}
