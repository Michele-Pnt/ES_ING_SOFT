public class main {
    public static void main(String[] args) {
        Animale[] animali = {new Cane(), new Gatto()};
        for (Animale a : animali) {
            a.verso();
        }
    }
}