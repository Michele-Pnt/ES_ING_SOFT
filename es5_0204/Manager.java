package es5_0204;

public class Manager {
    private String nome;
    private int id;
    private Team team;
    private int id_progetto;

    public Manager(String n, int i, Team t){
        this.nome = n;
        this.id = i;
        this.team = t;
    }
    public void assegnaProgetto(Progetto p){
        this.id_progetto = p.getId();
    }
}
