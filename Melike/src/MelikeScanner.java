import java.util.Scanner;

public class MelikeScanner {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Hello User. What is your name?");
		String userName = in.next();
		System.out.println("Hi " + userName + ". How old are you?");
		String age = in.next();
		System.out.println ("I can't believe your " + age + ". your so old you need to get a job " + userName + ".");
	} 

}
