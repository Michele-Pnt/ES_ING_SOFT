public class Prodotto {
    private String nome;
    private String codice;
    private double prezzo;

    public Prodotto(String nome, String codice, double prezzo) {
        this.nome = nome;
        this.codice = codice;
        this.prezzo = prezzo;
    }

    public String getCodice() {
        return codice;
    }

    @Override
    public String toString() {
        return nome + " [" + codice + "] - €" + prezzo;
    }
}