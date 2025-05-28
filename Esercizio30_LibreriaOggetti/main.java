import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Libro> libreria = new ArrayList<>();
        libreria.add(new Libro("Il Signore degli Anelli", "J.R.R. Tolkien"));
        libreria.add(new Libro("I Promessi Sposi", "A. Manzoni"));
        libreria.add(new Libro("1984", "G. Orwell"));
        for (Libro l : libreria) {
            System.out.println(l);
        }
    }
}