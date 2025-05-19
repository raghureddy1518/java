package day_5;
class car1{
  void race()
  {
	  System.out.println("drag race...");
  }
}
class Toyota extends car1{
	void model() {
		System.out.println("innova.....");
	}
}
class hybrid  extends Toyota{
	void range() {
		System.out.println("550km");
	}
}
public class p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hybrid d1=new hybrid ();
		d1.race();
		d1.model();
		d1.range();

	}

}