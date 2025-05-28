public class main {
    public static void main(String[] args) {
        int[] numeri = {12, 7, 34, 5, 21};
        int max = numeri[0];
        for (int n : numeri) {
            if (n > max) max = n;
        }
        System.out.println("Il massimo è: " + max);
    }
}