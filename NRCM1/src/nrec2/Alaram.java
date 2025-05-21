package nrcm;
import java.util.Scanner;

public class Alaram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter time:");
		String clock=sc.next();
		switch(clock) {
		case"6am":
			System.out.println("Wake up");
			break;
		case"8am":
			System.out.println("Eat Breakfast");
			break;
		case"10am":
			System.out.println("Go to college");
			break;
		default:
			System.out.println("Bunk the college");
			
		}

	}

}
