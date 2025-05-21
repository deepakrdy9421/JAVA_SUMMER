package nrcm;
abstract class test2{
	abstract void add();
	abstract void nall();
}
class abs extends test2{
	public void add() {
		System.out.println("Hello");
	}
	public void nall() {
		System.out.println("Good morning");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abs d1=new abs();
		d1.add();
		d1.nall();

	}

}
