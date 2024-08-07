package figespaciais;

public class Prisma {
        public double areabase;
        public double perimetrobase;
        public double volume;
        public dobule comprimento;
        public double altura;
        public double largura;
        public double superficie;

    public void calcAreabase() {
            areabase = comprimento * largura;
            System.out.println(areabase);
    }
    public void calcPerimetroBase() { 
            perimetrobase = 2 * (comprimento + largura);
            System.out.println(perimetrobase);
    }
    public void calcVolume() {
            volume = areabase * altura
            System.out.println(volume);
    }
    public void calcSuperficie() {
            superficie = 2 * (areabase + perimetro * altura);
            System.out.println(areasuperficie);
    }




}

