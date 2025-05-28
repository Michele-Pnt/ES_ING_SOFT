package Es8_0804;

import java.sql.Date;

public class Prenotazione {
    protected int id;
    protected Cliente Cliente;
    protected Veicolo Veicolo;
    protected Date data_i;
    protected Date data_f;
    protected String stato;

    public Prenotazione(int id, Cliente Cliente,  Veicolo Veicolo,  Date data_i,  Date data_f,  String stato){
            this.id = id;
            this.Cliente = Cliente;
            this.Veicolo = Veicolo;
            this.data_i = data_i;
            this.data_f = data_f;
            this.stato = "in attesa";
    }

    public void setStato(String s){
        this.stato = s;
    }

}
