package day_4;

public class p5 {
	double x,y,z;
	public p5(double x) {
		this.x=x;
		System.out.println("scc marks: "+x);
		
		
	}
	public p5(double x,double y) {
		this.x=x;
		this.y=y;
		System.out.println("scc and inter "+(x+y));
	}
	public p5(double x,double y,double z) {
		this.x=x;
		this.y=y;
		this.z=z;
		System.out.println("scc and inter and btech "+(x+y+z));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p5 t1=new p5(600);
		p5 t2=new p5(600,871);
		p5 t3=new p5(600,871,7);
		
		
		
		
		

	}

}
