package nrcm;
interface I1{
	void add();
	void sub();
}

public class Day5_inter implements I1 {
	public void add() {
		System.out.println("Hello");
	}
	public void sub() {
		System.out.println("Deepak Reddy");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day5_inter d1=new Day5_inter();
		d1.add();
		d1.sub();

	}

}
