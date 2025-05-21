package nrec;
interface student{
	void name();
}
interface id extends student{
	void Id();
}
class sample implements id{
	public void add() {
		System.out.println("Hello");
	}
	public void name() {
		System.out.println("Welcome");
	}
	public void Id() {
		System.out.println("NRCM");
	}
}
class sample2 implements id{
	public void Roll() {
		System.out.println("Hello");
	}
	public void name() {
		System.out.println("Namaste");
	}
	public void Id() {
		System.out.println("NRCM");
	}
}

public class day6_2  {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sample s1=new sample();
		sample2 s2=new sample2();
		s1.add();
		s1.name();
		s1.Id();
		s2.Roll();
		s2.name();
		s2.Id();
        

	}

}
