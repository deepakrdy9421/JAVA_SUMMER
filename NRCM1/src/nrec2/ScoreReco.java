package nrec2;
import java.util.*;

public class ScoreReco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner rd = new Scanner(System.in);

	        try {
	            System.out.print("Enter the  vaild student's name: ");
	            String Name = rd.nextLine();

	            if (Name == null || Name.trim().isEmpty()) {
	                throw new NullPointerException("Name cannot be null.");
	            }

	            System.out.print("Enter the student's score: ");
	            String scoreInput = rd.nextLine();

	            int Score = Integer.parseInt(scoreInput);

	            if (Score < 0 || Score > 100) {
	                throw new IllegalArgumentException("Score must be between 0 and 100.");
	            }

	            System.out.println("The score has been successfully recorded.");

	        } catch (NullPointerException e) {
	            System.out.println("Error: " + e.getMessage());
	        } catch (NumberFormatException e) {
	            System.out.println("Error: The score is not a valid integer.");
	        } catch (IllegalArgumentException e) {
	            System.out.println("Error: " + e.getMessage());
	        } finally {
	            rd.close();
	        }

	}

}
