package Java.Magazzino;

import java.util.HashMap;

public class Magazzino<T> {
    private HashMap <Oggetto, Integer> magazzino;

    public void addMagazizno(Oggetto o, Integer qtita){
        magazzino.entrySet(o,qtita);
    }
}
