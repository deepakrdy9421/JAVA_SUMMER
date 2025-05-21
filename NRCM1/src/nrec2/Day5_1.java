package nrcm;
class Animal{
	void roar() {
		System.out.println("Deepak is Roaring");
	}
}
class dog extends Animal{
	void bark() {
		System.out.println("Enemy is Barking");
	}
}
public class Day5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        dog d1=new dog();
        d1.roar();
        d1.bark();
	}

}
