package day_2;

public class p3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=11;
		if(n%2==0) {
			System.out.println("divisible by 2");
		}
		else {
			if(n%3==0) {
				System.out.println("not divisible by 3");
				
			}
			else {
				System.out.println("not divisible by 2 and 3");
			}
		}

	}

}
