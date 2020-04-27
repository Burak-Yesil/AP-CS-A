import java.util.Scanner;

public class ExponententTester {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a threshold(value for accuracy): ");
		int threshold = scan.nextInt();
		System.out.print("Enter value of x: ");
		float x = scan.nextFloat();
		ExpApproximator test = new ExpApproximator(threshold,x);
		
		System.out.println("\r\ne^" + x + " = " + test.exponentialTetsed());
		
	}
}
