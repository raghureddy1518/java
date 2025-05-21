package day_7;
class RaghuException extends Exception{
	public RaghuException(String message) {
		super(message);
	}
	
}
public class p6{
	public static void numCheck(int n) throws RaghuException {
		if(n%2==0) {
			throw new RaghuException("nak maths ochuuu");
		}else {
			System.out.println("nak maths radhuu");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			numCheck(8);
		}catch(RaghuException e) {
			System.out.println(e.getMessage());
		}

	finally {
		System.out.println("ochina gurthundadhuu");
	}
}}