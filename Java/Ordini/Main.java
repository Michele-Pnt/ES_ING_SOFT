package Java.Ordini;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Spedibile>ordini = new ArrayList<>();

        ordini.add(new OrdineNegozio());
        ordini.add(new OridneOnline());

        for(Spedibile s : ordini){
            s.spedizione();
        }
        
    }
}
