package Es8_0804;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Sistema {
    public static Boolean gestisciPrenotazione(Date data_i, Date data_f, Veicolo v, Cliente c){
        long differenzaMillisecondi = data_f.getTime() - data_i.getTime(); // Differenza in millisecondi
        long differenzaGiorni = TimeUnit.DAYS.convert(differenzaMillisecondi, TimeUnit.MILLISECONDS); // Conversione in giorni
        long importo = differenzaGiorni * v.getCosto();
        if(v.getStato() == "disponibile" && c.effettuaPagamento(importo) == true){
            c.effettuaPagamento(importo);
            return true;
        }else{return false;}
    }

    public Boolean logIn(Cliente c){
        return true;
    }
}
