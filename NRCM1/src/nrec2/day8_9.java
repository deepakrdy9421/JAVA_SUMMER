package nrec1;
import org.w3c.dom.events.EventException;

class MoreStockException extends Exception {
    public MoreStockException(String ItemId) {
        super("The " + ItemId + " cannot be ordered in quantities of more than 10 units.");
    }
}
class ShoppingBasket {
    public void addToCart(String productName, int quantity) throws MoreStockException {
        if (quantity > 10) {
            throw new MoreStockException(productName);
        } else {
            System.out.println(quantity + " units of " + productName + " added to the cart.");
        }
    }
}

public class day8_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
	            if (args.length < 2) {
	                throw new IllegalArgumentException("Please provide both product name and quantity.");
	            }

	            String productName = args[0];
	            int Load = Integer.parseInt(args[1]);

	            ShoppingBasket cart = new ShoppingBasket();
	            cart.addToCart(productName, Load);

	        } catch (MoreStockException e1) {
	            System.out.println("Error: " + e1.getMessage());
	        } catch (NumberFormatException e) {
	            System.out.println("Error: Quantity must be a valid integer.");
	        } catch (Exception e2) {
	            System.out.println("Error: " + e2.getMessage());
	        }

	}

}


