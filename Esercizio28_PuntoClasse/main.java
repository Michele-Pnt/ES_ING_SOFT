public class main {
    public static void main(String[] args) {
        Punto p = new Punto(3, 4);
        System.out.println("Punto: " + p);
        System.out.println("Distanza dall'origine: " + p.distanzaDalCentro());
    }
}