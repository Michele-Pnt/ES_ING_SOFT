import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String[] testo = {"ciao", "mondo", "java", "esercizio"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserisci la parola da cercare: ");
        String parola = sc.nextLine();
        boolean trovata = false;
        for (String s : testo) {
            if (s.equals(parola)) {
                trovata = true;
                break;
            }
        }
        if (trovata) {
            System.out.println("Parola trovata!");
        } else {
            System.out.println("Parola non presente.");
        }
    }
}