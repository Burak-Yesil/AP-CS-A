//Tests the pair class
public class PairTester {
	public static void main(String[] args){		
		//Takes User input
		Pair test = new Pair( 9, 12 );
		
		//prints sum
		System.out.println(test.getSum());	
		
		//prints difference
		System.out.println(test.getDifference());	
		
		//prints product
		System.out.println(test.getProduct());	
		
		//prints average
		System.out.println(test.getAvg());	
		
		//prints distance
		System.out.println(test.getDistance());	
		
		//prints maximum of the two points
		System.out.println(test.getMax());	
		
		//prints minimum of the two points
		System.out.println(test.getMin());
	}
}
