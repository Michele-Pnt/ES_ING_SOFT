public class main {
    public static void main(String[] args) {
        int[] numeri = {2, 4, 6, 8};
        int risultato = 1;
        for (int n : numeri) {
            risultato *= n;
        }
        System.out.println("Il prodotto di tutti gli elementi è: " + risultato);
    }
}