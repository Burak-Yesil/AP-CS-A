import java.awt.Rectangle;

public class FourRectanglePrinter {
public static void main(String[] args) {
		Rectangle box = new Rectangle(5,10,30,30);
		System.out.println(box);
		box.translate(30, 0);
		System.out.println(box);
		box.translate(-30, 10);
		System.out.println(box);
		box.translate(30,0);
		System.out.println(box);

	}
}
