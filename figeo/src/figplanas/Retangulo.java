package figplanas;

public class Retangulo {
	public double altura;
	public double comprimento;
	public double area;
	
	public void calcArea() {
		area = altura * comprimento;
		System.out.println(area);
	}
}
