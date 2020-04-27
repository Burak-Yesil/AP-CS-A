public class CashRegister{
	
	final double QUARTER_VALUE = 0.25;
	private double pCost;
	private double payment;
	public double change;
	public double givenChange;

	
	public CashRegister() {
		payment = 0;
		pCost = 0;
	}
	public void recordPurchase(double purchaseCost) {
		pCost = purchaseCost;
	}
	public void enterDollars(double dollarDeposit) {
		payment += dollarDeposit;
	}
	public void enterQuarters(double quarterDeposit) {
		payment += quarterDeposit * QUARTER_VALUE;
	}
	public double giveChange() {
		change = payment - pCost;
		givenChange = Math.round(change * 100.0) / 100.0;
		return givenChange;
	}
}