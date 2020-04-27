 import java.util.Scanner;

public class ConverterTester {

	public static void main(String[] args) {
		Scanner inval = new Scanner(System.in);
		Converter test = new Converter();
		
		System.out.println("Convert from:");
		String from = inval.nextLine();
		
		System.out.println("Convert To:");
		String to = inval.nextLine();
		
		System.out.println("Value:");
		double value = inval.nextDouble();
		
		System.out.println(test.convert(from, to, value));
	}
}
