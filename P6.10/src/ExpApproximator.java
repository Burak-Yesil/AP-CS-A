import java.util.Scanner;

public class ExpApproximator {
	
	   ExpApproximator(int threshold, float x) {	
		 sum = 1;
		this.threshold = threshold;
		this.x = x;
		
	}
	 
	  double exponentialTetsed() {
			for(int i = threshold-1; i > 0; i--)
				sum = 1+x  * sum / i;
			return sum;
	 }
	 
	 int threshold = 0;
	 double sum;
	 double x;
	 
}
	
	

