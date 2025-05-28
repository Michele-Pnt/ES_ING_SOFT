package Java.negozio;
import java.util.*;

public class Ordine {
    private int id;
    ArrayList <Prodotto> carrello;

    public Ordine(int id){
        this.id = id;
        this.carrello = new ArrayList<>();
    }

    public void addProd(Prodotto p){
        carrello.add(p);
    }

    public int calcolaTotale(){
        int totale = 0;
        for(Prodotto p: carrello){
            totale += p.getprezzo();
        }
        return totale;
    }
}
