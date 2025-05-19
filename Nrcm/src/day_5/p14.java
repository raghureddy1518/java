package day_5;
interface Lightcontrol{
	void lighton();
	
}
interface TempControl extends Lightcontrol{
	void setTemperature();
}
class Smarthome implements TempControl{
	public void  lighton() {
		System.out.println("light is on...good morning ");
	}
	public void  lightoff() {
		System.out.println("light is off..goodnight");
	}
	
	public void  setTemperature() {
		System.out.println("temperature is set to 20 degrees");
	}
	
}
class Smartsecurity implements TempControl{
	
	public void  lighton() {
		System.out.println("light is on..");
	}
	public void  lightoff() {
		System.out.println("light is off..");
	}
	
	public void  setTemperature() {
		System.out.println("temperature is set to 16 degrees");
	}
	public void  camera() {
		System.out.println("camera is recording..");
		
	}
	
	
}

public class p14 extends Smartsecurity  {
	

	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Smarthome p2=new Smarthome();
		p2.lighton();
		p2.setTemperature();
		p2.lightoff();
        p14 p1=new p14();
        p1.lighton();
        p1.setTemperature();
        p1.camera();
        p1.lightoff();



	

}}
