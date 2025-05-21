package day_8;

public class p1 implements Runnable {
	
	public void run () {
		System.out.println("hiiii");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p1 t1=new p1();
		Thread t2 =new Thread(t1);
		System.out.println("helloo");
		t2.start();

	}

}
