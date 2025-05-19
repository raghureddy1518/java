package day_3;

public class p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="raghu";
		String s2="raghu";
		String s3=new String("raghu");
		String s4=new String("raghu");
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		System.out.println(s3.equals(s4));
		System.out.println(s3==s4);
		System.out.println(s1.compareTo(s4));
		

	}

}
