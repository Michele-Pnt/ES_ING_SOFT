public class main {
    public static void main(String[] args) {
        String[] studenti = {"Anna", "Marco", "Luca"};
        boolean[][] presenze = {
            {true, false, true, true, true},
            {true, true, true, true, false},
            {false, true, false, true, true}
        };

        for (int i = 0; i < studenti.length; i++) {
            int tot = 0;
            for (int j = 0; j < presenze[i].length; j++) {
                if (presenze[i][j]) tot++;
            }
            System.out.println(studenti[i] + ": " + tot + " presenze");
        }
    }
}