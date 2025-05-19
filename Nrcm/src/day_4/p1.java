package day_4;
class fixedamount{
	public int fixamount=10000;
}
abstract class withdrawl{
	abstract void withdraw(int amount);
	
}

public class p1 extends withdrawl{
	fixedamount f1=new fixedamount();
	public void withdraw(int amount ) {
		 f1.fixamount-=amount;
		System.out.println( "withdrwn:" +amount);
		System.out.println("balance:"+f1.fixamount);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int amount =Integer.parseInt(args[0]);
		p1 d=new p1();
		d.withdraw(amount);

	}

}
