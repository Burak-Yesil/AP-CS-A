import java.util.Scanner;

		public class DexTester {
		//Constructor 
			DexTester(double balance, double rate, double targetBalance) {
			this.balance = balance;
			this.rate = rate;
			this.targetBalance = targetBalance;	
			
		}
		 //Calculator Method 
		 public static double calculateInvestment(double balance, double rate, double targetBalance) {
			 while (balance<targetBalance) {
				 years++;
				 double interest = (balance * rate/100);
				 balance += interest;
			 }
			 return years;
		 }
		 
		 //Main Method 
		 public static void main(String args[]){
			 Scanner in = new Scanner(System.in);
			 DexTester system = new DexTester(balance,rate,targetBalance);
			 
			 System.out.println("What is your current balance?");
			 balance = in.nextDouble();
			 
			 System.out.println("What is your annual interest rate?");
		   	 rate = in.nextDouble();
			 
			 System.out.println("What is your goal balance?");
			 targetBalance = in.nextDouble();
			 
			System.out.println(calculateInvestment(balance,rate,targetBalance));
			
			
	}
		 	//Variables 
			static double balance = 0;
			static double rate = 0;
			static double targetBalance = 0;
			static double interestEquation ;
			static double years = 0;		 
			
} 

