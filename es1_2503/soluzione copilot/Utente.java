package Ing_Software.eserciziPersonali.es1_2503;

public abstract class Utente {
    protected int id;
    private String nome;
    private String email;

    public Utente(int id, String nome, String email){
        this.id = id;
        this.nome = nome;
        this.email = email;
    }
    public  abstract void registrarsi();
    
    public  abstract void effettuareOrdine(Ordine o);

    public int getId(){
        return this.id;
    }
}
