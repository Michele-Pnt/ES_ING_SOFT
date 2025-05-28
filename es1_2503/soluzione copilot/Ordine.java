package Ing_Software.eserciziPersonali.es1_2503;

import java.util.HashMap;
import java.util.Map;

public class Ordine {
    private int id;
    private String stato;
    private Map<Prodotto, Integer> prodotti;

    public Ordine(int id) {
        this.id = id;
        this.stato = "In Elaborazione";
        this.prodotti = new HashMap<>();
    }

    public void aggiungereProdotto(Prodotto prodotto, int qta) {
        prodotti.put(prodotto, prodotti.getOrDefault(prodotto, 0) + qta);
        System.out.println("Prodotto " + prodotto.getNome() + " aggiunto all'ordine.");
    }

    public void confermareOrdine() {
        this.stato = "Confermato";
        System.out.println("Ordine confermato. Stato: " + stato);
    }
}