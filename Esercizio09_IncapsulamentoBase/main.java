public class main {
    public static void main(String[] args) {
        Persona p = new Persona();
        p.setNome("Mario Rossi");
        p.setEta(30);
        System.out.println(p);
        p.setEta(35);
        System.out.println("Nuova età: " + p.getEta());
    }
}