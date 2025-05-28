public class main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Fornisci delle parole come argomenti.");
            return;
        }
        System.out.println("Parole più lunghe di 5 lettere:");
        for (String parola : args) {
            if (parola.length() > 5) {
                System.out.println(parola);
            }
        }
    }
}