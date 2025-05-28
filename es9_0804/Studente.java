package es9_0804;
import java.util.*;

public class Studente extends Persona{
    private Map<Corso, Integer> voti;
    private Integer matricola;

    public Studente(Integer matricola, String nome, String cognome){
        super(nome, cognome);
        this.matricola = matricola;
        this.voti = new HashMap<>();
    }

    public void viewVoti(){
        for (Map.Entry<Corso, Integer> entry : voti.entrySet()){
            System.out.println("Corso: " + entry.getKey() + ", Voto: " + entry.getValue());
        }
    }

    public void viewDisp(Scuola s){

        for(Corso c : s.getCorsi()){
            if(c.viewStato() == "aperto"){
                System.out.println(c.getNome());
            }
        }
    }

    public void addVoto(Corso c, Integer voto){
        this.voti.put(c, voto);
    }
}
