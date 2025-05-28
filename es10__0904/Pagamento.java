package es10__0904;

public class Pagamento {
    private double saldo;
    private String metodo;

    public Pagamento(String metodo) {
        this.metodo = metodo;
    }
    public void paga(double importo){
        System.out.println("Pagamento effettuato con successo");
    }
}
