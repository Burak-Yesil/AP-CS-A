import java.util.Scanner;
	public class PracticeAverage {
		static String value = "0";

		public static void main(String [] args) {
			while (!(value.equalsIgnoreCase("q"))) {
			int sum = 0;
			Scanner in = new Scanner(System.in);
			System.out.println("How many numbers are in your set");
			int n = in.nextInt();
			System.out.println("Enter in each of your " + n +" numbers.");
			for ( int i = 1; i<=n; i++) {
					 sum += in.nextInt();
				}
			System.out.println("Your Sum is: " + sum);
			System.out.println("Click Q to quit");
			System.out.println("Click C to continue");
			value = in.next();
		}
	}
}
