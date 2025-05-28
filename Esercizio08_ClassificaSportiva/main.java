import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ArrayList<Squadra> classifica = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Quante squadre?");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("Nome squadra: ");
            String nome = sc.nextLine();
            System.out.print("Punti: ");
            int punti = sc.nextInt();
            sc.nextLine();
            classifica.add(new Squadra(nome, punti));
        }

        Collections.sort(classifica);

        System.out.println("\nClassifica:");
        for (Squadra s : classifica) {
            System.out.println(s.getNome() + " - " + s.getPunti());
        }
    }
}