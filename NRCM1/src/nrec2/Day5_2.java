package nrcm;
class meat{
	void chicken() {
		System.out.println("Eat chicken");
	}
}
class raw extends meat{
	void mutton() {
		System.out.println("mutton paya");
	}
}
class swim extends raw{
	void prawns() {
		System.out.println("Eat prawns");
	}
}
class hunt extends raw{
	void pig() {
		System.out.println("Eat pig");
	}
}
public class Day5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 swim s2=new swim();
		 hunt s3=new hunt();
		 
		 s2.chicken();
		 s2.prawns();
		 s3.pig();
		 s3.mutton();
		 
		 

	}

}
