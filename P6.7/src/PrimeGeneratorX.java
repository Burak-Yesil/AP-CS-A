
import java.util.Scanner;
 
public class PrimeGeneratorX {
    private static Scanner scanner = new Scanner( System.in );
    public static void main(String[] args) {
    	//Gets the max number
        System.out.println("Enter max number: ");
        String input = scanner.nextLine();
        int maxNumber = Integer.parseInt( input );
 
        System.out.println("List of the prime number between 1 - " + maxNumber);
      
        //where all of the calculations actually occur.
        //This is because of the rainbow method 
        for (int x = 2; x <= maxNumber; x++)
        {
            boolean isPrime = true;
            for (int i=2; i <= x/2; i++)
            {
                if ( x % i == 0)
                {   
                    isPrime = false;
                    break;
                }
            }
 
            if ( isPrime == true )
                System.out.println(x);
        }
    }
}