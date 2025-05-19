package day_3;

public class p3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="helloworld";
	String a=" ";
	String b=" ";
		for (int i=0;i<s.length();i++) {
			char ch =s.charAt(i);
			  if (ch=='a'||ch=='i'|ch=='e'||ch=='o'||ch=='u') {
				
				a=ch+a;
				
			}
			else if( ch>='a' && ch<='z'){
				 b=ch+b;
			}
			
		}
		System.out.println("ovels are::" +a);
		System.out.println("consonents are:: " +b);
		

	}

}
