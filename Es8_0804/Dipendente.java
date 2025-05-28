package Es8_0804;

public class Dipendente extends Persona {
    
    public void updateStato(Veicolo v, String stato){
        v.stato = stato;
    }

    public void gestisciPrenotazione(Prenotazione p, String stato){
        p.stato = stato;
    }
}
