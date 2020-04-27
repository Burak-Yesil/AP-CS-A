
public class QuadraticEquationTester {

	public static void main(String[] args) {
		
		QuadraticEQ qe = new QuadraticEQ(-3, 20, 34);
		System.out.println( qe.numOfsolutions() );
		System.out.println( qe.getSolution1() );
		System.out.println( qe.getSolution2() );
	
	}

}
