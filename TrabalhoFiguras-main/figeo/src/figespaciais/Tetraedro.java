package figespaciais;

public class Tetraedro {
	public double lado;
	public double area;
	public double volume;
	
	
	public void calcArea() {
		area = (lado * lado) * 1.73;
		System.out.println(area);
	}
	
	public void calcVolume() {
		volume = (lado * lado * lado) * (1.41/12);
		System.out.println(volume);
	}
	
}
