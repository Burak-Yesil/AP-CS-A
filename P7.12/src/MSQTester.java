import java.util.Scanner;
public class MSQTester {
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			
			MSQ m = new MSQ(4);
			System.out.println(m.colSum());
			System.out.println(m.rowSum());
			System.out.println(m.diaSum());
			System.out.println(m.isMagic());
		}
	}

