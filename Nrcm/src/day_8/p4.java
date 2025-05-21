package day_8;
class p4{
	public  static  void  main (String [] args) {
		Runnable r1=new Runnable() {
			public void run() {
				System.out.println("tsk one ");
			}
		};

Runnable r2 =new Runnable() {
	public void run() {
		System.out.println("task 2");
	}
};

Thread t1=new Thread(r1);
Thread t2=new Thread(r2);
t1.start();
t2.start();
for(int i=0;i<=10;i++) {
	System.out.print(i+" ");
}


	}

}
