package day_5;
interface Car{
	void model();
}
interface Bike{
	void speed();
}
interface ElectricBike{
	void price();
}
interface ElectricCar{
	void chargetime();
}
class Showroom implements Car,Bike,ElectricBike{
	public void model() {
		System.out.println("innova");
	}
	public void speed() {
		System.out.println("200km per hr");
	}
	public void price() {
		System.out.println("25lakhs");
		
	}
	
	
}
public class p18 extends Showroom implements ElectricCar{
	public void chargetime() {
		System.out.println("up to 200km");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p18 t1=new p18();
		t1.model();
		t1.speed();
		t1.price();
		t1.chargetime();

	}

}
