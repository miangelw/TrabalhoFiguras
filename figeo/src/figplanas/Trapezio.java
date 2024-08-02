package figplanas;

public class Trapezio {
	public double area;
	public double basemaior;
	public double basemenor;
	public double altura;
	
	public void calcArea() {
		area = ((basemaior + basemenor)*altura)/2;
		System.out.println(area);
	}
}
