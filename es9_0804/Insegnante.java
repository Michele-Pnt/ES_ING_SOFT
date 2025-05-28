package es9_0804;

public class Insegnante extends Persona{
    private int id;

    public Insegnante(int id, String nome, String cognome){
       super(nome, cognome);
        this.id = id;
    }

    public void assVoto(int voto, Studente s, Corso c){
        s.addVoto(c, voto);
    }
}
