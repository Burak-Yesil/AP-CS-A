import java.util.Scanner;

public class YearTester 
{
	public static void main(String args[]) 
	{
		System.out.println("Enter a year");
		Scanner burak = new Scanner(System.in);
		Year leapYear = new Year(burak.nextInt());
		System.out.println("isLeapYear: " + leapYear.isLeapYear());
	}
}



