package nrcm;
interface I1{
	void add();
}
class test3{
	void sub() {
		System.out.println("Hello");
	}
}

public class Day5_5 extends test3 implements I1 {
	public void add() {
		System.out.println("Hi!!!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day5_5 t1=new Day5_5();
		t1.add();
		t1.sub();

	}

}
