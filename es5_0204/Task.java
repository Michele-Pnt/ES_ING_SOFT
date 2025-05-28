package es5_0204;

public class Task {
    private int id;
    private String descrizione;
    private String stato;
    public int id_ing;

    public Task(int id, String descrizione, String stato){
        this.id = id;
        this.descrizione = descrizione;
        this.stato = stato;
    }

    public void aggiornaStato(String state){
        this.stato = state;
    }
}
