import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserisci un numero intero: ");
        int num = sc.nextInt();
        int count = 0;
        int n = Math.abs(num);
        if (n == 0) count = 1;
        while (n > 0) {
            n /= 10;
            count++;
        }
        System.out.println("Numero di cifre: " + count);
    }
}