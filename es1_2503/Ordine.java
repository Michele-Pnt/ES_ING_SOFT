package Ing_Software.eserciziPersonali.es1_2503;

import java.util.*;

public class Ordine {
    private int id_cliente;
    private int id;
    private String stato;
    private Map<Prodotto, Integer> carrello;

    public Ordine(int id, String stato, Cliente c){
        
        id_cliente = c.getId();
        this.id = id;
        this.stato = stato;
        this.carrello = new HashMap<>();
    }

    public void aggiungereProdotto(Prodotto p, int qtita){
        carrello.put(p,qtita);
    }

    public void confermaOrdine(){
        this.stato = "confermato";
    }
}
