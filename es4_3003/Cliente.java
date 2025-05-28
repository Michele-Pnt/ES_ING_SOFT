public class Cliente {
    private String nome;
    private int id;

    public Cliente(String nome, int id){
        this.id = id;
        this.nome = nome;
    }

    public int getId(){
        return this.id;
    }

    public String getNome(){
        return this.nome;
    }
}
