package es10__0904;

public class Main {
    public static void main(String args[]){
        Pagamento p = new Pagamento("carta");
        Partecipante marco = new Partecipante(1, "marco", "@", p);
        Evento e = new Evento("1", "evento1", "010123", "d", "annunciato");
        Biglietto b = new Biglietto(e, marco, "1", "non pagato", 10.0);
        Sistema.pagaBiglietto(b, marco);
        System.out.println(b.getStato());
    }
}
