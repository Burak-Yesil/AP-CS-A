import java.lang.Math;

public class IceCreamCone{
	private double height;
	private double radius;
	private double surfaceArea;
	private double area;
	private double volume;
	
	public IceCreamCone(double coneHeight, double coneRadius) {
		height = coneHeight;
		radius = coneRadius;
	}
	public double getSurfaceArea() {
		area = (height*height) + (radius*radius);
		surfaceArea = (Math.PI * radius)*(radius + Math.sqrt(area))-((Math.PI * radius)*(Math.PI * radius));
		return surfaceArea;
	}
	public double getVolume() {
		volume = (Math.PI * radius * height)/3;
		return volume;
	}
}