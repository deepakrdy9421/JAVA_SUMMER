package nrcm;
class fixedAmount{
	public int amount=10000;
}
abstract class WithdrawalAmount{
	abstract void  withdraw(int cash);
}

public class Day4_1 extends WithdrawalAmount{
	fixedAmount f1=new fixedAmount();
	void withdraw(int cash) {
		f1.amount-=cash;
		System.out.println("withdraw:"+cash);
		System.out.println("Available Balance:"+f1.amount);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cash=Integer.parseInt(args[0]);
		Day4_1 d=new Day4_1();
		d.withdraw(cash);
		

	}

}
