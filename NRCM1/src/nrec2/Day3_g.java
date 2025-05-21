package nrcm;
abstract class test3{
	abstract void add();
	abstract void sub();
	static void mul() {
		System.out.println("Play");
	}
	void div() {
		System.out.println("Cry");
	}
	void mod() {
		System.out.println("Sleep");
	}
}
	class Day3_g extends test3{
		public void add() {
			System.out.println("Clinb");
		}
		public void sub() {
			System.out.println("Swim");
		}
	


	public static void main(String[] args) {
		Day3_g d1=new Day3_g();
		d1.add();
		d1.sub();
		d1.div();
		d1.mod();
		test3.mul();

	}
	}

