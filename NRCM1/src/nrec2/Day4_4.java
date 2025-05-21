package nrcm;

public class Day4_4 {
	int a;
	int b;
	public Day4_4(int x,int y) {
		a=x;
		b=y;
		System.out.println(x+y);
	}
	public void add() {
		System.out.println(this.a-this.b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day4_4 t1=new Day4_4(70,40);
		t1.add();
		

	} 

}
