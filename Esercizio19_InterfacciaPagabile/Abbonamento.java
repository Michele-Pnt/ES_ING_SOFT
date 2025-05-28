public class Abbonamento implements Pagabile {
    private int mesi;
    private double costoMensile;

    public Abbonamento(int mesi, double costoMensile) {
        this.mesi = mesi;
        this.costoMensile = costoMensile;
    }

    public double calcolaTotale() {
        return mesi * costoMensile;
    }
}