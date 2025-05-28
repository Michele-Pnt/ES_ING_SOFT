public class Quadrato {
    private double lato;
    public Quadrato(double lato) {
        this.lato = lato;
    }
    public double area() {
        return lato * lato;
    }
    public double perimetro() {
        return lato * 4;
    }
}