import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ArrayList<Prodotto> magazzino = new ArrayList<>();
        magazzino.add(new Prodotto("Pane", "A001", 1.5));
        magazzino.add(new Prodotto("Latte", "A002", 0.99));
        magazzino.add(new Prodotto("Uova", "A003", 2.0));
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserisci codice prodotto da cercare: ");
        String codice = sc.nextLine();

        boolean trovato = false;
        for (Prodotto p : magazzino) {
            if (p.getCodice().equalsIgnoreCase(codice)) {
                System.out.println("Trovato: " + p);
                trovato = true;
            }
        }
        if (!trovato) System.out.println("Prodotto non trovato!");
    }
}