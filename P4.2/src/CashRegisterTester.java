public class CashRegisterTester{
	public static void main(String args[]) {
		CashRegister register = new CashRegister();
		register.recordPurchase(20.37);
		register.recordPurchase(35.0);
		register.enterDollars(55.0);
		register.enterQuarters(2.0);
		System.out.println("Change: " + register.giveChange());
		System.out.println("Expected: 0.13");
		System.out.println("Item Count: " + register.getItemCount());
		register.endPurchase();
	}
}