import java.util.Random;

public class textBooktester {
	public static void main(String[] args) {
		Random rnd = new Random();
		
		System.out.print ("Play this combination ");
		for (int i = 0; i < 6; i++) {
			System.out.print(rnd.nextInt(50)+" ");
			}
	System.out.print(" it'll make you rich");
	}	
}
