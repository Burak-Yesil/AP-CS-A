 import java.util.Scanner;
public class FibonacciGenerator {
	public int fold1 = 1;
	public int fold2 = 1;
	public int fnew;
	
	public int nextNumber() {
		fold2 = fold1;
		fold1 = fnew;
		fnew = fold1 + fold2; 
		return fnew;
	}
	
	//Tester
	public static void main(String[] args) {
			
			Scanner in = new Scanner(System.in);
			
			System.out.println("Enter n:");
			int n = in.nextInt();
			
			FibonacciGenerator fg = new FibonacciGenerator();

			for (int i = 1; i <= n; i ++) {
				System.out.println(fg.nextNumber());

		}	

	}
}
