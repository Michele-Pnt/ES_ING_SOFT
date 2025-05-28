package es5_0204;

import java.util.*;

public class Progetto {
    private int id;
    private String nome;
    private String descrizione;
    private ArrayList <Task> list_task;
    
    public Progetto(int id, String nome, String descrizione){
        this.id = id;
        this.nome = nome;
        this.descrizione = descrizione;
        this.list_task = new ArrayList<>();
    }

    public void aggiungiTask(Task t){
        list_task.add(t);
    }

    public void visualizzaTask(){
        for (Task t : list_task) {
            System.out.println(t);
        }
    }
}
