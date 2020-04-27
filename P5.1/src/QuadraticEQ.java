 public class QuadraticEQ{
	 
	 public  QuadraticEQ(double ai, double bi, double ci){
		 A = ai;
		 B = bi;
		 C = ci;
		 discriminant = (B*B) - (4*A*C);
	 }
	 
	 public boolean numOfsolutions() {
		 if (discriminant < 0) 
			 return false;                     //is there a way to make this just one single line and not a boolean
		 else 
			 return true;
		
	 }
	 
	 public double getSolution1() {
		if (discriminant > 0) {	
			double sol1 = (-B - Math.sqrt(discriminant))/(2*A);
			return sol1;}
		else {
			return nosol;
		}
		
	 }
	 
	 public double getSolution2() 
	 {
		if (discriminant > 0) { 
		 double sol2 = ( -B + Math.sqrt( discriminant ) ) / (2 * A);
		 return sol2;}
		else 
		{
		 return nosol;
		}
	 } 
	 double A;
	 double B;
	 double C;
	 double discriminant;
	 public static final double nosol = 0;
 }