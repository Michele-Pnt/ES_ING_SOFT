import java.util.ArrayList;

public class Cliente{
    private String nome;
    private int id;
    private String email;
    private String password;
    ArrayList <Ordine> ordini;

    public Cliente(String n, int i){
        this.nome = n;
        this.id = i;
        this.ordini = new ArrayList<>();
    }

    public void registrazione(String e, String p){
        this.email = e;
        this.password = p;
        System.out.println("utente registrato");
    }

    public int getId(){
        return this.id;
    }

    public void effettuaOrdine(Ordine o){
        this.ordini.add(o);
    }
}