package nrec2;
class InvalidIdException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidIdException (String message) {
		super(message);
	}
}

public class EmployeSearchSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			if(args.length==0) {
				System.out.println("Please enter an Employee ID:");
				return;
			}
			int empID = Integer.parseInt(args[0]);
            validateEmployeeID(empID);
            System.out.println("Valid Employee ID");
        } catch (InvalidIdException e) {
            System.out.println("Please Reenter your valid Employee ID ");
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid number as Employee ID.");
        }
		}
	public static void validateEmployeeID(int id) throws InvalidIdException {
        if (id < 0 || id > 999) {
            throw new InvalidIdException("Invalid Employee ID");
        }

	}

}
