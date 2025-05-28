package Es8_0804;

public class Cliente extends Persona{
    protected String metodo_p;
    protected double saldo;

    public Cliente(Pagamento p, double s){
        this.metodo_p = p.getMetodo();
        this.saldo = s;
    }

    public boolean effettuaPagamento(double importo){
        if(saldo >= importo){
            saldo -= importo;
            System.out.println("pagamento effettuato");
            return true;
        }else{
            System.out.println("pagamento rifiutato");
            return false;
        }
    }
}
