public class CashRegister{
	
	final double QUARTER_VALUE = 0.25;
	private double pCost;
	private double payment;
	private double change;
	private double givenChange;
	private int itemCount;
	
	public CashRegister() {
		payment = 0;
		pCost = 0;
	}
	public void recordPurchase(double purchaseCost) {
		pCost += purchaseCost;
		itemCount += 1;
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
	public int getItemCount() {
		return itemCount;
	}
	public void endPurchase() {
		itemCount = 0;
		payment = 0;
		pCost = 0;
	}
}