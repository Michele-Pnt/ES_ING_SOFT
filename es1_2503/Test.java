package Ing_Software.eserciziPersonali.es1_2503;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(){
        Cliente cliente = new Cliente(1,"michele", "lala");
        Amministratore amministratore = new Amministratore(2, "giorgio", "lulu");
        Prodotto arancia = new Prodotto(0, "arancia","succosa",1, 100);
        Prodotto mela = new Prodotto(1, "mela","dolce",10, 10);

        List<Prodotto> prodotti= new ArrayList<>();
        prodotti.add(arancia);
        prodotti.add(mela);

        Ordine ordine = new Ordine(0,"in attesa", cliente);
        ordine.aggiungereProdotto(mela, 2);
        ordine.aggiungereProdotto(arancia, 88);

        cliente.visualizzaProdotti(prodotti);
    }
}
