import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserisci una frase: ");
        String frase = sc.nextLine();
        String[] parole = frase.trim().split("\\s+");
        System.out.println("Numero di parole: " + parole.length);
    }
}