package figespaciais;

public class Paralelepipedo {
	public double comprimento;
	public double largura;
	public double altura;
	public double volume;
	public double area;
	
	public void calcArea() {
		area = (comprimento * altura * 2) + (comprimento * largura * 2) + (altura * largura * 2);
		System.out.println(area);
	}
	
	public void calcVolume() {
		volume = comprimento * altura * largura;
		System.out.println(volume);
	}
}

