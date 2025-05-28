package Java.negozio;

import java.util.*;

public class Cliente {
    private String nome;
    private ArrayList <Ordine> ordini;

    public Cliente(String nome){
        this.nome = nome;
        this.ordini = new ArrayList<>();
    }

    public void addOrdine(Ordine o){
        ordini.add(o);
    }
    
}
