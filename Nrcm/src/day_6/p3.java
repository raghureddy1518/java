package day_6;
 //final
 class test1{
	 //final
	 public void show() {
		System.out.println("hii");
	}
}

public class p3 extends test1 {// final class cannot acess
	public void show() {//method cannot acces the final methods
		System.out.println("hellooo");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p3 t1=new p3();
		t1.show();

	}

}
