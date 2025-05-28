public class main {
    public static void main(String[] args) {
        Studente[] studenti = {
            new Studente("Anna", 28),
            new Studente("Luca", 30),
            new Studente("Marco", 25)
        };
        for (Studente s : studenti) {
            System.out.println(s);
        }
    }
}