package es10__0904;

import java.util.*;

public class Evento {
    private String id;
    private String nome;
    private String data;
    private String descrizione;
    private String stato;

    ArrayList<Personale> personale;

    public Evento(String id, String nome, String data, String descrizione, String stato) {
        this.id = id;
        this.nome = nome;
        this.data = data;
        this.descrizione = descrizione;
        this.stato = stato;
        this.personale = new ArrayList<>();
    }
    public void setStato(String s) {
        this.stato = s;
    }
}
