public class main {
    public static void main(String[] args) {
        Forma[] forme = new Forma[2];
        forme[0] = new Cerchio(5);
        forme[1] = new Rettangolo(4, 6);

        for (Forma f : forme) {
            System.out.println("Area: " + f.area());
        }
    }
}