package figespaciais;

public class Cilindro {
	public double raio;
	public double altura;
	public double areabase;
	public double arealateral;
	public double area;
	public double volume;
	
	public void calcArea() {
		areabase = raio * raio * 3.14;
		arealateral = 2 * 3.14 * raio * altura;
		area = areabase * 2 + arealateral;
		System.out.println(area);
	}
	
	public void calcVolume() {
		volume = areabase * altura;
		System.out.println(volume);
	}
}
