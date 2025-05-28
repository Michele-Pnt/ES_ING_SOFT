public class Piatto {
    private String nome;
    private int prezzo;

    public Piatto(String n, int p){
        this.nome = n;
        this.prezzo = p;
    }

    public int getPrezzo(){
        return this.prezzo;
    }

    public String getNome(){
        return this.nome;
    }
}
