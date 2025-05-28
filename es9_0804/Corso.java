package es9_0804;
import java.util.*;

public class Corso {
    private String nome;
    private Insegnante docente;
    private int max_studneti;
    private String stato;
    private ArrayList<Studente> studenti;
    Map <Studente, Integer> voti;

    public Corso(String nome, Insegnante docente, int max_studneti){
        this.nome = nome;
        this.docente = docente;
        this.max_studneti = max_studneti;
        this.stato = "aperto";
        this.studenti = new ArrayList<>();
    }

    public String viewStato(){
        return this.stato;
    }

    public void viewIscritti(){
        for(Studente s : studenti){
            System.out.println(s.getCognome());
        }
    }

    public void viewVoti(){
        for (Map.Entry<Studente, Integer> entry : voti.entrySet()){
            System.out.println("Studente: " + entry.getKey() + ", Voto: " + entry.getValue());
        }
    }

    public String getNome(){
        return this.nome;
    }

    public void iscrivi(Studente s){
        if(studenti.size() < max_studneti){
            studenti.add(s);
        }
        else{
            this.stato = "chiuso";
        }
    }
}
