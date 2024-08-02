package figespaciais;

public class Esfera {
	public double areatotal;
	public double volume;
	public double raio;
	
	public void calcAreaTotal() {
		areatotal = 4 * 3.14 * raio * raio;
		System.out.println(areatotal);
	}
	public void calcVolume() { 
		volume = (4 * 3.14 * raio * raio *raio)/3;
		System.out.println(volume);
	}
}
