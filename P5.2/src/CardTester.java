import java.util.Scanner;

public class CardTester {

	public static void main(String[] args) {
		
		Scanner burak = new Scanner(System.in);
		CardClass card = new CardClass();
		
		System.out.println("Enter the card notation:");
		System.out.println( card.GetDescription( burak.nextLine() ) );
		

	}

}
