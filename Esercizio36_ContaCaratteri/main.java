import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserisci una frase: ");
        String frase = sc.nextLine();
        System.out.println("Numero di caratteri: " + frase.length());
    }
}