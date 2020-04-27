public class TriangleTester {

	public static void main(String[] args) {
		
		Triangle tri = new Triangle(0, 0, 0, 5, 5, 0);
		System.out.println("Lenght A:  " + tri.getLengthA());
		System.out.println("Length B:  " + tri.getLengthB());
		System.out.println("Length C:  " + tri.getLengthC());
		System.out.println("Angle A:   " + tri.getAngleA());
		System.out.println("Angle B:   " + tri.getAngleB());
		System.out.println("Angle C:   " + tri.getAngleC());
		System.out.println("Perimeter: " + tri.getPerimeter());
		System.out.println("Area:      " + tri.getArea());
	}

}
