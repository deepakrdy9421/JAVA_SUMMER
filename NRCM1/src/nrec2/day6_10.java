package nrec;
interface electronics{
	void Electro();
}
interface Gadgets{
	void gadgets();
}
interface Phones{
	void phones();
}
interface footwear extends electronics,Gadgets,Phones{
	void foot();
}
class Accessories implements footwear{
	public void access() {
		System.out.println("Accessories are: Luggage,watches");
	}
	public void Electro() {
		System.out.println("Electronics are:TV,Fridges,ACs");
	}
	public void gadgets() {
		System.out.println("Gadgets are: Bluetooth Speaker,Head Phone");
	}
	public void phones() {
		System.out.println("Phones are:Apple,samsung,Vivo,IQoo");
	}
	public void foot() {
		System.out.println("Footwear are:flip lops,sandals,shoes");
	}
}

public class day6_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Accessories a1=new Accessories();
		a1.access();
		a1.Electro();
		a1.gadgets();
		a1.phones();
		a1.foot();

	}

}
