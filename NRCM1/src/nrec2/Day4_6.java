package nrcm;

public class Day4_6 {
	int x;
	int y;
	int z;
	public Day4_6(){
		System.out.println("Welcome to Deepak Reddy Profile");
	}
	public Day4_6(int x){
		this.x=x;
		System.out.println(x);
		
	}
	public Day4_6(int x,int y) {
		this.x=x;
		this.y=y;
		System.out.println(x+y);
	}
	public Day4_6(int x,int y,int z) {
		this.x=x;
		this.y=y;
		this.z=z;
		System.out.println(x+y+z);
	}

	public static void main(String[] args) {
		Day4_6 t1=new Day4_6();
		Day4_6 t2=new Day4_6(100);
		Day4_6 t3=new Day4_6(100,96);
		Day4_6 t4=new Day4_6(100,96,91);
	
		// TODO Auto-generated method stub

	}

}
