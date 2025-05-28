package Es8_0804;

public  abstract class Persona {
    protected String nome;
    protected String cognome;
    protected int id;

    public String getNome(){
        return this.nome;
    }

    public int getId(){
        return this.id;
    }
}
