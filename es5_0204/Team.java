package es5_0204;

import java.util.ArrayList;

public class Team {
    private String nome;
    private ArrayList <Ingegnere> membri;
    
    public void aggiungiMembro(Ingegnere i){
        membri.add(i);
    }

}
