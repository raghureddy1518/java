package day_5;
interface  AppointmentBooking{
	void book();
}
interface  MedicalRecord{
	void records();
}
interface  Prescription extends  MedicalRecord , AppointmentBooking{
	void tablets();
}
class Patient{
	public void problem() {
		
	}
}
public class p21 extends Patient implements Prescription {
	public void book() {
		System.out.println("patient book the appointment ");
	}
	public void records() {
		System.out.println("patient have is records ");
	}
	public void tablets() {
		System.out.println("patient take the tablets ");
	}
	public void problem() {
		System.out.println("patient's problem");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p21 t1=new p21();
		
		t1.book();
        t1.problem();
        t1.records();
        t1.tablets();
	}

}
