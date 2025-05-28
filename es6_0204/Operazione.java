package es6_0204;

import java.util.Date;

public abstract class Operazione {
    protected String nome_o;
    protected Double importo;
    protected Date data;
    protected Cliente conto_cliente;

    public Operazione(String nome_o, Double importo, Date data, Cliente c){
        this.nome_o = nome_o;
        this.importo = importo;
        this.data = data;
        this.conto_cliente=c;
    }
}
