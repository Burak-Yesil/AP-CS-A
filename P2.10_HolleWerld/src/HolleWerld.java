 import java.lang.Object;
 import java.lang.String;

public class HolleWerld {
public static void main(String[] args ) {
	String one = "Hello World";
	System.out.println(one);
	one = one.replace("e", "$");
	one = one.replace("o", "e");
	one = one.replace("$", "o");	
	System.out.println(one);
	}
}
