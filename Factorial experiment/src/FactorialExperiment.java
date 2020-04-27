
public class FactorialExperiment {
public static void main(String [] args) {
	recursion(10);
}

public static void recursion(int n) {
	int x=n;
	if (x == 1) {
		System.out.println("You are done");
	}
	else {
		n*=x;
		x--;
		recursion(x);
	}
	
	System.out.println(n);
	
}
}