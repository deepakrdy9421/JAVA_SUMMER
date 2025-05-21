package nrec1;

public class day7_nested {
	void show() {
		System.out.println("Hello!!!");
	}
	class Test23{
		void display() {
			System.out.println("World");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		day7_nested d1=new day7_nested();
		d1.show();
		day7_nested.Test23 t1=new day7_nested().new Test23();
		t1.display();
	}

}
