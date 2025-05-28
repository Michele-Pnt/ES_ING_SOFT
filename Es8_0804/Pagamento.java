package Es8_0804;

public class Pagamento {

    protected String metodo;

    public Pagamento(String m){
        this.metodo = m;
    }

    public String getMetodo(){
        return this.metodo;
    }
}
