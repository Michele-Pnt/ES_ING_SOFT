package Ing_Software.eserciziPersonali.es1_2503;

public class Pagamento {
    private int id;
    private String metodo;
    private String esito;

    public Pagamento(int id, String metodo) {
        this.id = id;
        this.metodo = metodo;
        this.esito = "In Attesa";
    }

    public boolean elaborarePagamento() {
        this.esito = "Riuscito";
        System.out.println("Pagamento elaborato con successo. Esito: " + esito);
        return true;
    }
}