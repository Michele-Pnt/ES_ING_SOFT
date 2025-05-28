import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ArrayList<Studente> studenti = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Quanti studenti vuoi inserire?");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Matricola: ");
            String matricola = sc.nextLine();
            System.out.print("Numero voti: ");
            int numVoti = sc.nextInt();
            int[] voti = new int[numVoti];
            for (int j = 0; j < numVoti; j++) {
                System.out.print("Voto " + (j+1) + ": ");
                voti[j] = sc.nextInt();
            }
            sc.nextLine();
            studenti.add(new Studente(nome, matricola, voti));
        }

        System.out.println("\nMedia voti studenti:");
        for (Studente s : studenti) {
            System.out.printf("%s (%s): %.2f\n", s.getNome(), s.getMatricola(), s.media());
        }
    }
}