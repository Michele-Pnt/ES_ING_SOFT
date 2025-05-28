package es10__0904;

public class Sistema {
    public static void pagaBiglietto(Biglietto b, Partecipante partecipante) {
        if(b.getStato() == "non pagato") {
            b.setStato("pagato");
            Pagamento p = partecipante.getPagamento();
            p.paga(b.prezzo);
        } else {
            System.out.println("Il biglietto è già stato pagato");
        }
    }
}
