package day_2;

public class p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=11;
		if(n%2==0) {
			System.out.println("yes it divisible by 2");
			if(n%3==0)
			{
				System.out.println("yes it is divisible by 3");
			}
			else {
				System.out.println("not divisible by 3");
			}
		}
		else {
			if (n<10) {
				System.out.println("below 10");
				
			}
			else {
				System.out.println("above 10");
			}
		}

	}

}
