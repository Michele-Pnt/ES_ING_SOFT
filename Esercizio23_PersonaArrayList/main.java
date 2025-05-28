import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Persona> persone = new ArrayList<>();
        persone.add(new Persona("Luca", 22));
        persone.add(new Persona("Martina", 24));
        persone.add(new Persona("Giorgia", 20));
        for (Persona p : persone) {
            System.out.println(p);
        }
    }
}