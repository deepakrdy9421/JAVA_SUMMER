package nrcm;

public class Day2 {

	public static void main(String[] args) {
		int a=9;
		if(a%2==0) {
			if(a<=5) {
				System.out.println("Condition is satisifed");
			}
			else {
				if(a%4==0) {
					System.out.println("Multiplied");
				}
				else {
					System.out.println("Not multiplied");
				}
			}
		
		}
		else {
			if(a%3==0)
			{
				System.out.println("It is multiplied with 3");
			}
			else {
				System.out.println("It is not multiplied with 3");
			}
		}

	}

}
