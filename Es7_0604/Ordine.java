import java.util.ArrayList;

public class Ordine {
    private int totale;
    private String stato; 
    private String pagamento;
    ArrayList <Piatto> piatti;

    public Ordine(int t, String p){
        this.totale = t;
        this.stato = "elaborazione";
        this.pagamento = p;
        this.piatti = new ArrayList<>();
    }

    public void aggiungiPiatto(Piatto p){
        this.piatti.add(p);
    }

    public void setStato(String s){
        this.stato = s;
    }

    public void setPagamento(String p){
        this.pagamento = p;
    }

    public int calcolaTotale(){
        int total = 0;
        for(Piatto p : piatti){
            total += p.getPrezzo();
        }

        return total;
    }
}
