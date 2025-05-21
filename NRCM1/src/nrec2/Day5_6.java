package nrcm;
interface empname{
	void name();
}
interface empid{
	void Id();
}
interface empadd extends empname,empid{
	void add();
}
public class Day5_6 implements empadd {
	public void display() {
		System.out.println("All details:");
	}
	public void name() {
		System.out.println("Name: Deepak Reddy");
	}
	public void Id() {
		System.out.println("Id: 12345");
	}
	public void add() {
		System.out.println("Village: Ankapur");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day5_6 d1=new Day5_6();
		d1.display();
		d1.name();
		d1.Id();
		d1.add();

	}

}
