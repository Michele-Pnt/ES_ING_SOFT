package Ing_Software.eserciziPersonali.es1_2503;

import java.util.List;

public class Cliente extends Utente {

    public Cliente(int id, String nome, String email) {
        super(id, nome, email);
    }

    @Override
    public void effettuareOrdine(Ordine ordine) {
        System.out.println("Ordine effettuato dal cliente " + nome);
    }

    public void visualizzareProdotti(List<Prodotto> prodotti) {
        System.out.println("Prodotti disponibili:");
        for (Prodotto prodotto : prodotti) {
            System.out.println("- " + prodotto.getNome() + " (€" + prodotto.getPrezzo() + ")");
        }
    }
}