package day_7;

public class p7 extends Thread {
	public static void main(String[] args) {
		p7 d1=new p7();
		p7 d2=new p7();
		p7 d3=new p7();
		p7 d4=new p7();
	
		System.out.println(d1.getName());
		System.out.println(d2.getName());
		System.out.println(d3.getName());
		System.out.println(d4.getName());
	}

}