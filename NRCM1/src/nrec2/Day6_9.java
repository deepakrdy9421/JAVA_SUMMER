package nrec;
interface tiffins{
	void Tiffins();
}
interface meals{
	void Meals();
}
interface drinks{
	void Drinks();
}
class desert implements tiffins,meals,drinks{
	public void Desert() {
		System.out.println("Deserts are: Gulab Jamun,Rasmalia,Junnu");
	}
	public void Tiffins() {
		System.out.println("Tiffins are :Dosa,Idly,Poori,Vada");
	}
	public void Meals() {
		System.out.println("Meals includes: Rice,Sambar,Papad,Chutney,Curd");
	}
	public void Drinks() {
		System.out.println("Drinks contians: Soft drinks,Milk Shakes,Juices");
	}
}
interface hotel{
	void Hotel();
}
class list extends desert implements hotel{
	public void Menu() {
		System.out.println("Menu Details are:");
	}
	public void Hotel() {
		System.out.println("ANKAPUR ORDER MESS");
	}
}

public class Day6_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		list m1=new list();
		desert d1=new desert();
		m1.Hotel();
		m1.Menu();
		d1.Meals();
		d1.Tiffins();
		d1.Drinks();
		d1.Desert();

	}

}
