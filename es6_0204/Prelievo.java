package es6_0204;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Prelievo extends Operazione{
    List <Date> listaPrelievi;
    
    public Prelievo(String nome_o, Double importo, Date data, Cliente c){
        super(nome_o, importo, data, c);
        listaPrelievi = new ArrayList<>();
    }

    public Boolean effettuaPrelievo() {
        if(Sistema.getPermission(this.conto_cliente, this.importo, "prelievo")){
            this.conto_cliente.updateSaldo(-this.importo);
            listaPrelievi.add(this.data);
            return true;
        }else{
            System.out.println("saldo insufficente");
        }
        return false;
    }

    public void viewPrelievi(){
        for (Date d : listaPrelievi) {
            System.out.println(d);
        }
    }
}
