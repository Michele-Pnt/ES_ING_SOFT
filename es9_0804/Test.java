package es9_0804;
public class Test {
    public static void main(String[] args){
        Insegnante i = new Insegnante(1, "Marco", "Rossi");
        Insegnante i2 = new Insegnante(2, "Luca", "Verdi");
        Studente s = new Studente(1, "Mario", "Bianchi");
        Studente s2 = new Studente(2, "Giovanni", "Neri");
        Corso c = new Corso("Matematica", i, 30);
        Corso c2 = new Corso("Storia", i2, 1);
        Scuola sc = new Scuola();
        sc.addCorso(c);
        sc.addCorso(c2);
        c.iscrivi(s);
        c.iscrivi(s2);
        c2.iscrivi(s);
        c2.iscrivi(s2);
        c.viewIscritti();
        c2.viewIscritti();
        s.viewDisp(sc);
        s.addVoto(c2, 18);
        s.viewVoti();
        
    }
}
