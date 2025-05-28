package Ing_Software.eserciziPersonali.es1_2503;

import java.util.List;

public class Amministratore extends Utente {

    public Amministratore(int id, String nome, String email) {
        super(id, nome, email);
    }

    @Override
    public void effettuareOrdine(Ordine ordine) {
        System.out.println("Gli amministratori non possono effettuare ordini.");
    }

    public void aggiungereProdotto(List<Prodotto> prodotti, Prodotto prodotto) {
        prodotti.add(prodotto);
        System.out.println("Prodotto " + prodotto.getNome() + " aggiunto al catalogo.");
    }

    public void rimuovereProdotto(List<Prodotto> prodotti, Prodotto prodotto) {
        prodotti.remove(prodotto);
        System.out.println("Prodotto " + prodotto.getNome() + " rimosso dal catalogo.");
    }
}