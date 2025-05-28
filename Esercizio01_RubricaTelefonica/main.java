import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ArrayList<Contatto> rubrica = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Quanti contatti vuoi aggiungere?");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Numero: ");
            String numero = sc.nextLine();
            rubrica.add(new Contatto(nome, numero));
        }

        System.out.println("\nRubrica:");
        for (Contatto c : rubrica) {
            System.out.println(c);
        }
    }
}