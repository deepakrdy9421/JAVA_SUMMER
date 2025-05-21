package nrcm;
class test3{
	 void add() {
		System.out.println("Hiiii");
	}
}

public class Day5_ovridi extends test3{
	void add() {
		System.out.println("Hello!!!!");
	}
	public static void main(String[] args) {
		Day5_ovridi d1=new Day5_ovridi();
		d1.add();
		

	}

}
