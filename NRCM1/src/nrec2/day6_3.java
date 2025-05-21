package nrec;
interface restarunt{
	void kompally();
}
class dish{
	public void  fav() {
		System.out.println("An Te Ra");
			}
}
class palace extends dish implements restarunt{
	public void near() {
		System.out.println("Ulvacharu");
	}
	public void kompally() {
		System.out.println("Restaurants in Kompally: ");
	}
}
class menu extends palace{
	public void Course() {
		System.out.println("Malnadu");
	}
	
}

public class day6_3 {

	public static void main(String[] args) {
		palace p1=new palace();
		menu m1=new menu();
		p1.kompally();
		m1.Course();
		p1.near();
		p1.fav();

	}

}
