import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserisci una parola: ");
        String parola = sc.nextLine().toLowerCase();
        int cont = 0;
        for (char c : parola.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) cont++;
        }
        System.out.println("Numero di vocali: " + cont);
    }
}