import java.util.Scanner;

public class NumberStrandCalculator {
	public static int n;
	public static double sum;
	public static double average = sum/n;
	public static double standardDeviation;
	public static double sumSquared;
	
	// This is the main function
	public  void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("How many numbers are in your number set?");
		 n = in.nextInt();  
		 
		 for (int i = 1; i<= n; i++) {
			 sum+=in.nextDouble();
		 }
		 	standardDeviation = Math.sqrt( (( sumSquared -  (1 / n) * sumSquared ) / (n - 1) ));
		 	System.out.println("Average: " + average);
		 	System.out.println("Standard Deviation: " + standardDeviation);
	}
}
