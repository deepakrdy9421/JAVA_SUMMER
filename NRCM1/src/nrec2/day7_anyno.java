package nrec1;
class Demo1 {
	void show() {
		System.out.println("Hii");
	}
}

public class day7_anyno {
	Demo1 d =new Demo1() {
		void show() {
			System.out.println("Hello");
			super.show();
		}
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		day7_anyno d1=new day7_anyno();
		d1.d.show();
		

	}

}
