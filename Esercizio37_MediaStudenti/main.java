public class main {
    public static void main(String[] args) {
        Studente[] studenti = {
            new Studente("Anna", 28),
            new Studente("Luca", 30),
            new Studente("Marco", 25)
        };
        int somma = 0;
        for (Studente s : studenti) {
            somma += s.getVoto();
        }
        double media = (double) somma / studenti.length;
        System.out.println("Media voti: " + media);
    }
}