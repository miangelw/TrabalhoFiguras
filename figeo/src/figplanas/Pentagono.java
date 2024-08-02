package figplanas;

public class Pentagono {
	public double area;
	public double lado;
	public double apotema;
	public double perimetro;
	
	public void calcArea() {
		perimetro = lado * 5; 
		area = (perimetro * apotema)/2;
		System.out.println(area);
	}
}
