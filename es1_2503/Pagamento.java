package Ing_Software.eserciziPersonali.es1_2503;

public class Pagamento {
    private int id;
    private String metodo;
    private String esito;

    public Pagamento(int id, String metodo, String esito){
        this.esito = esito;
        this.id = id;
        this.metodo = metodo;
    }

    public boolean elaboraPagamento(){
        return false;
    }
}
