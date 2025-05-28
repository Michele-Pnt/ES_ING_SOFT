package es6_0204;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Juan", "Pérez", "12345678", "juan@gmail.com", 8291828, 10000.0);
        Cliente c2 = new Cliente("ehi", "Michael", "12345678", "ehui@gmail.com", 8291828, 100.0);
        Date data = new Date();
        c1.viewSaldo();
        Deposito o1 = new Deposito("deposito", 200.0, data, c1);
        o1.effettuaDeposito();
        c1.viewSaldo();
        Prelievo o2 = new Prelievo("prelievo", 50000.0, data, c1);
        o2.effettuaPrelievo();
        c1.viewSaldo();
        Bonifico o3 = new Bonifico("bonifico", 50.0, data, c1);
        o3.effettuaBonifico();
        c1.viewSaldo();
    }
}
