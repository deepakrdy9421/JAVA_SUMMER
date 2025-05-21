package nrec2;
class InvalidAgeException extends Exception {
    public InvalidAgeException(String info) {
        super(info);
    }
}
class User {
    private int Age;

    public User(int age) throws InvalidAgeException {
        if (Age <= 0) {
            throw new InvalidAgeException("Age cannot be Less Than Zero.");
        } else if (Age > 100) {
            throw new InvalidAgeException("Age cannot be greater than 100.");
        }
        this.Age = age;
        System.out.println("Valid age.");
    }
}

public class UserRegisWeb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
	            if (args.length == 0) {
	                throw new IllegalArgumentException("Please provide the Valid age.");
	            }

	            int age = Integer.parseInt(args[0]);
	            User user = new User(age);

	        } catch (InvalidAgeException e1) {
	            System.out.println(e1.getMessage());
	        } catch (NumberFormatException e) {
	            System.out.println("Invalid input: Age must be a number.");
	        } catch (Exception e2) {
	            System.out.println("Error: " + e2.getMessage());
	        }

	}

}
