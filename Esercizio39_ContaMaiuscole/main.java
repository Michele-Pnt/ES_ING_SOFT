import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserisci una frase: ");
        String frase = sc.nextLine();
        int count = 0;
        for (char c : frase.toCharArray()) {
            if (Character.isUpperCase(c)) count++;
        }
        System.out.println("Numero di lettere maiuscole: " + count);
    }
}