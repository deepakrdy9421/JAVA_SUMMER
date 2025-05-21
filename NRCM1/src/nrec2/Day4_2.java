package nrcm;

public class Day4_2 {
	private String firstName;
	private String lastName;
	private String EmailId;
	private long Phoneno;
	public void setFirstName(String fn) {
		firstName=fn;
	}
	public void setLastName(String ln) {
		lastName=ln;
	}
	public void setemailid(String ei) {
		EmailId=ei;
	}
	public void setphoneno(long pn) {
		Phoneno=pn;
	}
	public String getFirstName() {
		return firstName;			
	}
	public String getLastName() {
		return lastName;
	}
	public String getemailid() {
		return EmailId;
	}
	public long getphoneno() {
		return Phoneno;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day4_2 d1=new Day4_2();
		d1.setFirstName("Deepak");
		d1.setLastName("Reddy");
		d1.setemailid("kommula123@gmail.com");
		d1.setphoneno(9346267037L);
		System.out.println(d1.getFirstName());
		System.out.println(d1.getLastName());
		System.out.println(d1.getemailid());
		System.out.println(d1.getphoneno());
		

	}

}
