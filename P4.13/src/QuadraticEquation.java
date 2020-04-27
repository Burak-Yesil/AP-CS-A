public class QuadraticEquation{
	private double a;
	private double b;
	private double c;
	private double sqrtPart;
	private double solution1;
	private double solution2;
	
	public QuadraticEquation(double coeffA, double coeffB, double coeffC) {
		a = coeffA;
		b = coeffB;
		c = coeffC;
	}
	public double getSolution1() {
		sqrtPart = (b*b) - (4 * a * c);
		solution1 = ((-1 * b) + Math.sqrt(sqrtPart)) / (2 * a);
		return solution1;
	}
	public double getSolution2() {
		sqrtPart = (b*b) - (4 * a * c);
		solution2 = ((-1 * b) - Math.sqrt(sqrtPart)) / (2 * a);
		return solution2;
	}
}