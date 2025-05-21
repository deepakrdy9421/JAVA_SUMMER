package nrec2;
import java.util.*;

public class ApplicationforBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner r=new Scanner(System.in);
		System.out.println("Enter an integer as a string: ");
	String value=r.next();
	try {
		int number=Integer.parseInt(value);
		System.out.println("Parsed integer: "+ number);
	}catch(NumberFormatException e) {
		System.out.println("Error: The input is not a valid integer.");
		
	}
	finally {
		r.close();
	}

	}

}
