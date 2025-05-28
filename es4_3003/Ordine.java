import java.util.*;

public class Ordine {
    private int id_cliente;
    private int id_personale;
    private List<Piatti> piatti;
    private double totale;
    private String stato;

    public Ordine(Cliente c, Personale p, Piatti piatto, String stato){
        id_cliente = c.getId();
        id_personale = p.getId();
        this.totale = 0;
        piatti = new ArrayList<>();
        this.stato = "ordine vuoto";
    }

    public void add(Piatti piatto, String stato){
        piatti.add(piatto);
        this.totale += piatto.getPrice();
        this.stato = "in elaborazione";
    }
}
