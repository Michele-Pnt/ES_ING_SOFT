package Ing_Software.eserciziPersonali.es1_2503;

public class Prodotto {
    private int id;
    private String nome;
    private String descrizione;
    private double prezzo;
    private int quantitaDisponibile;

    public Prodotto(int id, String nome, String descrizione, double prezzo, int quantitaDisponibile) {
        this.id = id;
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.quantitaDisponibile = quantitaDisponibile;
    }

    public String getNome() {
        return nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void aggiornareStock(int qta) {
        this.quantitaDisponibile += qta;
        System.out.println("Stock aggiornato. Quantità disponibile: " + quantitaDisponibile);
    }
}