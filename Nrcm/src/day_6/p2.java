package day_6;
class test{
	 //final
	 public void show() {
		System.out.println("hii");
	}
}

public class p2 extends test {
	public void show() {//method cannot acces the final methods
		System.out.println("hellooo");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p2 t1=new p2();
		t1.show();

	}

}
