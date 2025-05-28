import java.util.*;
class Ordine {
    private String idutente;
    private List<Piatti> piatti;
    private String stato;
    private double totale;

    public Ordine(Cliente cliente) {
        this.idutente = cliente.getID();
        this.piatti = new ArrayList<>();
        this.stato = "In preparazione"; // Stato iniziale dell'ordine
        this.totale = 0.0;
    }

    public void aggiungiPiatto(Piatti piatto) {
        piatti.add(piatto);
        totale += piatto.getPrezzo();
    }

    public void aggiornaStato(String stato) {
        this.stato = stato;
        System.out.println("Stato aggiornato: " + this.stato);
    }

    public void rimuoviPiatto(Piatti piatto) {
        if (piatti.remove(piatto)) {
            totale -= piatto.getPrezzo();
        } else {
            System.out.println("Piatto non trovato nell'ordine.");
        }
    }

    public double getTotale() {
        return totale;
    }

public void VisualizzaOrdine() {
    System.out.println("ID Utente: " + idutente);
    System.out.println("Stato dell'ordine: " + stato);
    System.out.println("Piatti ordinati:");
    for (Piatti piatto : piatti) {
        System.out.println("- " + piatto.getNome() + ": " + piatto.getPrezzo());
    }
    System.out.println("Totale: " + totale);

}
}