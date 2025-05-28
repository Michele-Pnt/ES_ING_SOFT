public class main {
    public static void main(String[] args) {
        int[][] matrice = {{2, 3}, {4, 5}};
        int moltiplicazione = 1;
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                moltiplicazione *= matrice[i][j];
            }
        }
        System.out.println("Il prodotto di tutti gli elementi è: " + moltiplicazione);
    }
}