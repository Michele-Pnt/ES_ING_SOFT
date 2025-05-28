package es10__0904;

public class Biglietto {
    Evento e;
    Partecipante p;
    String id;
    String stato;
    double prezzo;

    public Biglietto(Evento e, Partecipante p, String id, String stato, double prezzo) {
        this.e = e;
        this.p = p;
        this.id = id;
        this.stato = stato;
        this.prezzo = prezzo;
    }
    public void setStato(String s) {
        this.stato = s;
    }

    public String getStato() {
        return stato;
    }
}
