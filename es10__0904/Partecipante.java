package es10__0904;

public class Partecipante {
    private int id;
    private String nome;
    private String email;
    private Pagamento pagamento;

    public Partecipante(int id, String nome, String email, Pagamento p) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.pagamento = p; 
    }


    public Pagamento getPagamento() {
        return pagamento;
    }
}
