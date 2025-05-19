package day_4;

public class p2 {
	private String firstName;
	private String lastName;
	private String email;
	private long phonenum;
	public void setFirstName(String fn) {
		firstName=fn;
	}
	public void setLastName(String ln) {
		lastName=ln;
	}
	public void setEmail(String em) {
		email=em;
	}
	public void setPhnnum(long pn) {
		phonenum=pn;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getEmail() {
		return email;
	}
	public long getPhnnum() {
		return phonenum;
		
	}
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p2 d=new p2();
		d.setFirstName("Raghu");
		d.setLastName("reddy");
		d.setEmail("kurmeraghureddy6@gmail.com");
		d.setPhnnum(9963219821l);
		System.out.println(d.getFirstName());
		System.out.println(d.getLastName());
		System.out.println(d.getEmail());
		System.out.println(d.getPhnnum());

		

	}

}
