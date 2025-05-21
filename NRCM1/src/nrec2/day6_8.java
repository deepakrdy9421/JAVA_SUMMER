package nrec;
interface politicians{
	void politics();
}
 class tent implements politicians{
	void Central() {
		System.out.println("Prime minister,Central Home Minister,Cabinet Minister");
	}
	void Politics() {
		System.out.println("Leaders in central are:");
	}
	@Override
	public void politics() {
		// TODO Auto-generated method stub
		
	}
	
}
interface media{
	void channels();
}
class Median implements media{
	public void count() {
		System.out.println("Media channels are: ");
	}
	public void channels() {
		System.out.println("TV9,NTV,BBC,HMTV,ETV");
	}	
}
interface corruption{
	void corrupt();
}
class illegal implements corruption{
	public void Illegal() {
		System.out.println("corruptions held by:");
	}
	public void corrupt() {
		System.out.println("Politicans,Police,Govt officers");
	}
}


public class day6_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tent t1=new tent();
		Median m1=new Median();
		illegal i1=new illegal();
		t1.politics();
		t1.Central();
		m1.count();
		m1.channels();
		i1.Illegal();
		i1.corrupt();
		

	}

}
