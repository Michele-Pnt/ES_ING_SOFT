import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String[] nomi = {"Anna", "Luca", "Giorgio", "Martina"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserisci un nome da cercare: ");
        String cerca = sc.nextLine();

        boolean trovato = false;
        for (String nome : nomi) {
            if (nome.equalsIgnoreCase(cerca)) {
                trovato = true;
                break;
            }
        }
        if (trovato) {
            System.out.println("Nome trovato!");
        } else {
            System.out.println("Nome NON trovato.");
        }
    }
}