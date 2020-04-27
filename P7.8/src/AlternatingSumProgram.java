import java.util.Arrays;
import java.util.Scanner;

public class AlternatingSumProgram {
	public static void main(String [] args) {
	int total = 0;
	int size = 0;
	Scanner in = new Scanner(System.in);
	System.out.println("How big is your number collection");
	int Sum [] = new int[in.nextInt()];
	
	for (int i = 0; i<Sum.length; i++) {
		System.out.println("Enter the "+ (i+1) + " integer value.");
		Sum[i] = in.nextInt();
	}
	
	for (int a = 0; a<Sum.length; a+=2) {
		total += Sum[a];
	}
	
	for (int b = 1; b<Sum.length; b+=2) {
		total -= Sum[b];
	}
	System.out.println(total);
}
}
