package figplanas;

public class Hexagono {
	public double area;
	public double lado;

	public void calcArea() {
		area = (3 * lado * lado * 1.73)/2;
	 	System.out.println(area);
	}
}
