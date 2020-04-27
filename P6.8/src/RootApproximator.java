import java.util.Scanner;

public class RootApproximator {
	
	double pre;
	double A;
	double differance;
	boolean simGuess = false;
	
	public RootApproximator(double a, double EPSILON) {
		A = a;
		pre = (A + 1)/2.0;
		differance = EPSILON;
	}
	
	public double nextGuess() {
		double guess = ((A/pre)+pre)/2;
		if (Math.abs(guess-pre) <= differance) simGuess = true; 
		pre = guess;
		return guess;
	}
	
	public boolean hasMoreGuesses() {
		if (simGuess) return false;
		return true;
	}
	
	public static void main(String []args) {
		System.out.println("Type a number: ");
		Scanner in = new Scanner(System.in);
		int root = in.nextInt();
		RootApproximator approx = new RootApproximator(root, .000000001);
		while (approx.hasMoreGuesses()) {
			System.out.println(approx.nextGuess());
		}
	}
}