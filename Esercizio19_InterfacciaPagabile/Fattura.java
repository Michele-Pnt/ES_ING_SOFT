public class Fattura implements Pagabile {
    private double importo;

    public Fattura(double importo) {
        this.importo = importo;
    }

    public double calcolaTotale() {
        return importo;
    }
}