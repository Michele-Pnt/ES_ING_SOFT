package es5_0204;

public class Ingegnere {
    private String nome;
    private int id;
    private String ruolo;

    public Ingegnere(String nome, int id, String ruolo){
        this.id = id;
        this.nome = nome;
        this.ruolo = ruolo;
    }

    public void  assegnaTask(Task t){
        t.id_ing = this.id;
    }

    public void visualizzaInfo(){
        System.out.println("");
    }
}
