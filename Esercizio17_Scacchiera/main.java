public class main {
    public static void main(String[] args) {
        String[][] scacchiera = new String[8][8];
        String[] primaRiga = {"Torre", "Cavallo", "Alfiere", "Regina", "Re", "Alfiere", "Cavallo", "Torre"};

        for (int i = 0; i < 8; i++) {
            scacchiera[0][i] = primaRiga[i];
        }

        for (int i = 1; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                scacchiera[i][j] = ".";
            }
        }

        for (String[] riga : scacchiera) {
            for (String cella : riga) {
                System.out.print(cella + "\t");
            }
            System.out.println();
        }
    }
}