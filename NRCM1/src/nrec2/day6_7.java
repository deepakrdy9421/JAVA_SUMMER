package nrec;
interface vehicle{
	void cars();
}
interface TwoWheeler{
	void bikes();
}
interface Cycle extends vehicle,TwoWheeler{
	void cycle();
}
class Trucks{
	void trucks() {
		System.out.println("Trucks are: TATA,BHARATHBENZ,ASHOKLEYLAND");
	}
}
class Scooter extends Trucks implements Cycle{
	public void scooty() {
		System.out.println("Scooties are : Activa,Suzuki,Access");
	}
	public void cars() {
		System.out.println("Cars are: BMW,Benz,Fortuner");
	}
	public void bikes() {
		System.out.println("Bikes are: Royal Enfield,Hero,Jawa");
	}
	public void cycle() {
		System.out.println("Cyles are : Hero,Atlas");
	}
	
}

public class day6_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scooter s1=new Scooter();
		Trucks t1=new Trucks();
		s1.cars();
		s1.bikes();
		s1.scooty();
		s1.cycle();
		t1.trucks();
		
	}

}
