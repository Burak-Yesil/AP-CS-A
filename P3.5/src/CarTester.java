
public class CarTester {
	
	public static void main(String args[]) {
		
		Car camry = new Car(50); //Car fuel efficiency is 50 mpg
		camry.addGas(20); //Car has 20 gallons of gas
		camry.drive(100); //Car drives 100 miles
		System.out.println( camry.getGasInTank() ); //Car has 18 gallons of gas left
		
	}

}
