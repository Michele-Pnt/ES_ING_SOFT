public class main {
    public static void main(String[] args) {
        Pagabile[] pagamenti = {
            new Fattura(150.0),
            new Abbonamento(12, 10.0)
        };

        for (Pagabile p : pagamenti) {
            System.out.println("Totale da pagare: " + p.calcolaTotale());
        }
    }
}