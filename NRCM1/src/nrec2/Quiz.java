package nrec2;
import java.util.*;

public class Quiz {

	public static void main(String[] args) {
		 Scanner d = new Scanner(System.in);
	        try {
	            System.out.println("Enter the value of 'x': ");
	            int x = d.nextInt();

	            System.out.println("Enter the value of 'y': ");
	            int y = d.nextInt();

	            int result = x / y;
	            System.out.println("Value of x/y: " + result);

	        } catch (ArithmeticException e) {
	            System.out.println("Arithmetic Exception: " + e.getMessage());
	        } catch (InputMismatchException e) {
	            System.out.println("Input Mismatch Exception: Please enter valid integer values.");
	        } finally {
	            d.close();
	        }
		// TODO Auto-generated method stub

	}

}
