	import java.util.Scanner;

public class FactorGeneratorX {

	int input = 0;
	int num = 2;
	
	public FactorGeneratorX(int numberToFactor) {
		input = numberToFactor;	
	}
	
	public boolean hasMoreFactors() {
		if(input > 1) return true;
		return false;
	}
	
	public int nextFactor() {
		while(input > 2) {
			if(input % num == 0) {
				input /= num;
				return num;
			}
			num++;	
		}
		return 1;
	}
	



		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			System.out.println("Enter a number: ");		
			FactorGeneratorX factor = new FactorGeneratorX(in.nextInt());
			while(factor.hasMoreFactors()) System.out.println(factor.nextFactor());
		}

	}


