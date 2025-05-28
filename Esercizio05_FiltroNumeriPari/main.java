public class main {
    public static void main(String[] args) {
        int[] numeri = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("Numeri pari:");
        for (int n : numeri) {
            if (n % 2 == 0) {
                System.out.println(n);
            }
        }
    }
}