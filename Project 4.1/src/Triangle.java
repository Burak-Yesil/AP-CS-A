public class Triangle {
	
	double aX = 0;
	double aY = 0;
	double bX = 0;
	double bY = 0;
	double cX = 0;
	double cY = 0;
	
	public double lengthA;
	public double lengthB;
	public double lengthC;
	
	public Triangle(double xPointA, double yPointA, double xPointB, double yPointB,
			double xPointC, double yPointC) {
		aX = xPointA;
		aY = yPointA;
		bX = xPointB;
		bY = yPointB;
		cX = xPointC;
		cY = yPointC;
	}
	 
	public double getLengthC() {
		lengthC = Math.sqrt(Math.pow((aX - bX), 2) + Math.pow((aY - bY),2));
		return lengthC;
	}
	
	public double getLengthA() {
		lengthA = Math.sqrt(Math.pow((bX - cX), 2) + Math.pow((cY - bY),2));
		return lengthA;
	}

	public double getLengthB() {
		lengthB = Math.sqrt(Math.pow((aX - cX), 2) + Math.pow((aY - cY),2));
		return lengthB;
	}
	
	public double getAngleA() {
		double cosA = (Math.pow(lengthB, 2) + Math.pow(lengthC,2) - Math.pow(lengthA,2))/ (2*lengthB*lengthC);
		double inverseA = Math.acos(cosA);
		return inverseA;
	}
	
	public double getAngleB() {
		double cosB = (Math.pow(lengthC, 2) + Math.pow(lengthA,2) - Math.pow(lengthB,2))/ (2*lengthA*lengthC);
		double inverseB = Math.acos(cosB);
		return inverseB;	
	}
	
	public double getAngleC() {
		double cosC = Math.acos((Math.pow(lengthA, 2) + Math.pow(lengthB,2) - Math.pow(lengthC,2))/ (2*lengthA*lengthB));
		return cosC;
	}	
	
	public double getPerimeter() {
		return (lengthA + lengthB + lengthC);
	}
	
	public double getArea() {
		double area = (lengthA * lengthB) / 2;
		return area;
	}
}