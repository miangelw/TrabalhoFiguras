package figespaciais;

public class Cubo {
	public double lado;
	public double arealateral;
	public double areabase;
	public double areatotal;
	public double volume;
	public double areaface;
	
	public void calcAreaLateral() {
	 areaface = lado * lado;
	 arealateral = areaface * 4;
	 System.out.println(arealateral);
	}
	public void calcAreaBase() {
		areabase = areaface;
		System.out.println(areabase);
	}
	public void calcAreaTotal() {
		areatotal = arealateral + (areabase *2);
		System.out.println(areatotal);
	}
	public void calcVolume() {
		volume = lado * lado * lado;
		System.out.println(volume);
	}
}
