import java.util.ArrayList;

public class FaceBookArrayOne {
public static void main(String [] args) {
	int [] AL = {1,0,0,2,5,0};
	int [] temp = AL;
	
	ArrayList <Integer> test = new ArrayList <Integer>();
	test.add(1);
	test.add(0);
	test.add(0);
	test.add(2);
	test.add(5);
	test.add(0);
	
	for (int i = 0; i<test.size(); i++) {
		if (test.get(i) ==  0) {
			test.remove(i);
			test.add(0);
		}
	}
	System.out.println(test);
}
	
}
