import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RectangularShape;
import java.lang.Object;

public class IntersectionPrinter {
	public static void main(String []args) {
		Rectangle r1 = new Rectangle(5,10,30,30);
		System.out.println(r1);
		Rectangle r2 = new Rectangle (11,9,30,30);
		System.out.println(r2);
		Rectangle r3 = r1.intersection(r2);
		System.out.println(r3);
	}
}
