import java.util.Scanner;

public class GoogleIntTester {
		public static void main(String [] args)
		{
		Scanner Burak = new Scanner(System.in);
		GoogleInt Melike = new GoogleInt();
		
		System.out.print("First Number:");
		
		double firstNum = Burak.nextDouble();
		
		System.out.print("Second Number:");
		
		double secondNum = Burak.nextDouble();
		
		System.out.print("Third Number:");
		
		double thirdNum = Burak.nextDouble();
		
		System.out.print("Fourth Number:");
		
		double fourthNum = Burak.nextDouble();
		
		System.out.print(Melike.GoogleInterview(firstNum, secondNum, thirdNum, fourthNum));
		}

	}

