package nrcm;

public class Day3_i {

	public static void main(String[] args) {
		abstract class withdrawalAmount{
			protected int currentBalance;
			public withdrawalAmount(int initialAmount)
			{
				this.currentBalance=initialAmount;
			}
			public abstract void withdraw(int amount);
			public int getcurrentBalance() {
				return currentBalance;
			}
		}

	}

}
