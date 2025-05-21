package nrec;
interface Fridges{
	void type();
}
class Test{
	public void tv() {
		System.out.println("Tv Brands are: TCL,SONY,SAMSUNG");
	}
}
class Test24 extends Test implements Fridges{
	public void watches() {
		System.out.println("Watche Brands are: TITAN,ROLEX,FOSSIL");
	}
	public void type() {
		System.out.println("Refridgerator Brands are:LG,Samsung,Haier");
	}
}
class Test31{
	public void brands() {
		System.out.println("Most popular Brands: Apple,Samsung,Google");
	}
}
class Test4 extends Test31{
	public void pods() {
		System.out.println("Airpods Brands are: Apple,Boat");
	}
}
public class Day6_j {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1=new Test();
		Test24 t2=new Test24();
		Test31 t3=new Test31();
		Test4 t4=new Test4();
		t1.tv();
		t2.type();
		t2.watches();
		t2.tv();
		t3.brands();
		t4.brands();
		t4.pods();

	}

}
