public class main {
    public static void main(String[] args) {
        int[] numeri = {1, 2, 3, 4, 5};
        System.out.print("Array invertito: ");
        for (int i = numeri.length - 1; i >= 0; i--) {
            System.out.print(numeri[i] + " ");
        }
        System.out.println();
    }
}