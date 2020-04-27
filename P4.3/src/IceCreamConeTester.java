public class IceCreamConeTester{
	public static void main(String args[]) {
		IceCreamCone cone1 = new IceCreamCone(15.0, 5.0);
		System.out.println("Surface Area: " + cone1.getSurfaceArea());
		System.out.println("Volume: " + cone1.getVolume());
	}
}