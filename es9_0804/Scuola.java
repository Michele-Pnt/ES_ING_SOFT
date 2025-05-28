package es9_0804;

import java.util.*;

public class Scuola {
    private ArrayList <Corso> corsi;

    public Scuola(){
        this.corsi = new ArrayList();
    }

    public void addCorso(Corso c){
        corsi.add(c);
    }

    public ArrayList<Corso> getCorsi(){
        return this.corsi;    
    }
}
