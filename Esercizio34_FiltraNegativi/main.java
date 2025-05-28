public class main {
    public static void main(String[] args) {
        int[] numeri = {-5, 2, -1, 7, 0, -3, 4};
        System.out.print("Numeri positivi o nulli: ");
        for (int n : numeri) {
            if (n >= 0) {
                System.out.print(n + " ");
            }
        }
        System.out.println();
    }
}