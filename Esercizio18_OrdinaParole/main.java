import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Fornisci parole come argomenti.");
            return;
        }
        Arrays.sort(args);
        System.out.println("Parole ordinate:");
        for (String parola : args) {
            System.out.println(parola);
        }
    }
}