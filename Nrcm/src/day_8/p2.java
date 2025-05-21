package day_8;

public class p2 implements Runnable {
	
	public void run () {
		System.out.println("hiiii");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p2 t1=new p2();
		Thread t2 =new Thread(t1);
		Thread t3 =new Thread(t1);
		System.out.println("helloo");
		t2.start();
		t3.start();

	}

}