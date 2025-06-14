public class Punto {
    private int x, y;
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public double distanzaDalCentro() {
        return Math.sqrt(x*x + y*y);
    }
    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}