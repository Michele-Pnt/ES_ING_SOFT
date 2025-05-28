public class main {
    public static void main(String[] args) {
        int somma = 0;
        for (String arg : args) {
            try {
                somma += Integer.parseInt(arg);
            } catch (NumberFormatException e) {
                System.out.println("Ignorato valore non numerico: " + arg);
            }
        }
        System.out.println("Somma: " + somma);
    }
}