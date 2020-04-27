import java.util.Scanner;

public class SorterTester {

	public static void main(String[] args) {
		
		Scanner burak = new Scanner(System.in);
		Sorter sort = new Sorter();
		
		System.out.println("Enter Three Floating Point Numbers:");
		System.out.println( sort.sorter( burak.nextDouble(), burak.nextDouble(), burak.nextDouble() ) );

	}

}
