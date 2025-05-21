package nrcm;
class chocolate{
	void eat() {
		System.out.println("Eat chocolate");
	}
}
class dark extends chocolate{
	void taste() {
		System.out.println("Taste is good");
	}
}
class sweet extends chocolate{
	void taste2() {
		System.out.println("Taste is very good");
	}
}
class barboun extends dark{
	void cost() {
		System.out.println("10 rupess");
	}
}
class amul extends dark{
	void cost2() {
		System.out.println("20 rupees");
	}
}
class dairymilk extends sweet{
	void weight() {
		System.out.println("100g");
	}
}
class kitkat extends sweet{
	void weight2() {
		System.out.println("200g");
	}
}

public class Day5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		barboun b1=new barboun();
		amul a1=new amul();
		dairymilk d1=new dairymilk();
		kitkat a2=new kitkat();
		b1.cost();
		b1.taste();
		b1.eat();
		a1.cost2();
		d1.weight();
		d1.taste2();
		d1.eat();
		a2.weight2();

	}

}
