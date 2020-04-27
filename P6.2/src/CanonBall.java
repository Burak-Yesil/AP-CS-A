public class CanonBall {
	
	double velocity,position;
	
	CanonBall(double velocity) {
		this.velocity = velocity;
	}
	
	public void movePosition() {
		this.position += this.velocity * 0.01;
		this.velocity = this.velocity - 9.81 * 0.01;
	}
	
	public double getX() {
		return this.position;
	}
	
	public double getY() { 
		return this.velocity;
	}
	
	public void launchBall(double initialVelocity) {
		for (int i = 0; this.position >= 0; i++) {
			if (i % 100 == 0) {
				System.out.print( "(" + this.getX() + ", " + this.getY() + ")");
				System.out.println( " " +  (-0.5 * 9.81 * Math.pow( i / 100, 2) + initialVelocity * i / 100));
// Why are math.pow(i/100,2) used answer: because it is moving at 100 meters per second.
//fix up confusion between velocity variable and intialVelocity parameter.
			}
			movePosition();
		}
	}
	
	
//Main Portion of the program	
	public static void main(String []args) {
		CanonBall ball = new CanonBall(100);
		ball.launchBall(100);
		
	}
}
	

