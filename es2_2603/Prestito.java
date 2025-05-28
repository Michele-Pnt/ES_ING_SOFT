package Ing_Software.eserciziPersonali.es2_2603;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Prestito {
    private int id;
    Studente studente;
    private Date dataInizio;
    private Date dataFine;
    private Date dataRestituzione;

    List<Libro> libriPrestito;

    public Prestito(int id, Date dataI, Date dataF, Date dataR){
        studente = new Studente();
        libriPrestito = new ArrayList<>();
    }
}
