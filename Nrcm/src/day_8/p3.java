package day_8;

 class test1 extends Thread {
	
	public void run () {
		System.out.println("heeyyyyy");
	}}
class test2 extends test1{
			
			public void run () {
				System.out.println("good morning");
			}}
class test3 implements Runnable {
					
					public void run () {
						System.out.println("hiiii");
					}
}
class test4 extends test3 {
						
						public void run () {
							System.out.println("hellooo");
						}
}

class p3{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1 t1=new test1();
		test2 t2=new test2();
		test3 t3=new test3();
		test4 t4=new test4();
		t1.start();
		t2.start();
		Thread l3 =new Thread (t3);
		l3.start();
		Thread l4=new Thread (t4);
		l4.start();
		
}
}