package figespaciais;

public class Piramide {
	public double area;
	public double volume;
	public double areabase;
	public double arealateral;
	public double altura;
	public double ladobase;
 
	public void calcAreaBase() {
		areabase = ladobase * ladobase;
		System.out.println(areabase);
	}
	public void calcAreaLateral( double alturalateral) {
		arealateral = ((alturalateral * ladobase)/2)*4;
	}
	public void calcAreaTotal() {
		area = areabase + arealateral;
	}
}
