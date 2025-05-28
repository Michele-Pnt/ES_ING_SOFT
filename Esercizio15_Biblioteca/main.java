import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ArrayList<Libro> libri = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Quanti libri vuoi inserire? ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("Titolo: ");
            String titolo = sc.nextLine();
            System.out.print("Autore: ");
            String autore = sc.nextLine();
            System.out.print("Anno: ");
            int anno = sc.nextInt();
            sc.nextLine();
            libri.add(new Libro(titolo, autore, anno));
        }

        System.out.println("\nLista libri in biblioteca:");
        for (Libro l : libri) {
            System.out.println(l);
        }
    }
}