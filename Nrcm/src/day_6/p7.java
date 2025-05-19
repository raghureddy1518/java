package day_6;

class test21 {
	static void show() {
		System.out.println("hiiii");
	}
	static class test2{
		static void print() {
			System.out.println("hellooo");
			show();
		}
	}
}
public class p7{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test21.test2.print();

	}

}
