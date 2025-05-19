package day_5;
class animal{
  void sleep()
  {
	  System.out.println("sleeping...");
  }
}
class Dog extends animal{
	void Bark() {
		System.out.println("Barking.....");
	}
}
public class p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d1=new Dog ();
		d1.sleep();
		d1.Bark();

	}

}
