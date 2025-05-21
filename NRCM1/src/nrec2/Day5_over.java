package nrcm;

public class Day5_over {
	void show() {
		System.out.println("Good Morning!!");
	}
	
	void show(int a,int b) {
		System.out.println(a+b);
	}
	void show(double d1,double d2) {
		System.out.println(d1-d2);
	}
	void show(String s1,String s2) {
		System.out.println(s1+s2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day5_over d1=new Day5_over();
		d1.show();
		d1.show(5, 11);
		d1.show(8.5, 7.5);
		d1.show("Deepak", "reddy");
		

	}

}
