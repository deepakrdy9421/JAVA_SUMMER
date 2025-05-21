package nrcm;

public class Day4_5 {
	int x;
	int y;
	public Day4_5(int x,int y) {
		this.x=x;
		this.y=y;
		System.out.println(x+y);
	}
	public Day4_5(Day4_5 t1) {
		this.x=t1.x;
		this.y=t1.y;
		System.out.println(x-y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day4_5 t1=new Day4_5(45,30);
		Day4_5 t2=new Day4_5(t1);

	}

}
