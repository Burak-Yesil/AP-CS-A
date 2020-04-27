import java.util.Scanner;

public class CurrencyConverter {

		
		public static void main(String args[]){
			 String Value = "0";
			 double rate = 0;
			 double usdValue = 0;
			 
			while (!(Value.equalsIgnoreCase("q"))) {
			Scanner burak = new Scanner(System.in);
			
			System.out.println("Enter USD to Euro rate");
			rate = burak.nextDouble();
			
			System.out.println("Enter USD value");
			 usdValue = burak.nextDouble();
		
			
			double conversion = rate * usdValue;

			System.out.println("");
			System.out.println(usdValue + " dollars : " + conversion + " Euros");
			System.out.println("");
			System.out.print("Eneter Q to quit. Enter C to continue");
			 Value = burak.next();
			}
			
	 } 
}
