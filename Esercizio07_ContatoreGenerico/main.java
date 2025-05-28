public class main {
    public static void main(String[] args) {
        Integer[] numeri = {1,2,3,4,5};
        String[] parole = {"ciao", "java"};

        Contatore<Integer> cNum = new Contatore<>(numeri);
        Contatore<String> cParole = new Contatore<>(parole);

        System.out.println("Numeri: " + cNum.conta());
        System.out.println("Parole: " + cParole.conta());
    }
}