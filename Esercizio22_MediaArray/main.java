public class main {
    public static void main(String[] args) {
        int[] numeri = {7, 9, 3, 5, 10};
        int somma = 0;
        for (int n : numeri) {
            somma += n;
        }
        double media = (double) somma / numeri.length;
        System.out.println("La media è: " + media);
    }
}