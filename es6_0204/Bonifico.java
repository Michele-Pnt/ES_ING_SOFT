package es6_0204;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Bonifico extends Operazione{
    List <Date> listaBonifici;
    
    public Bonifico(String nome_o, Double importo, Date data, Cliente c){
        super(nome_o, importo, data, c);
        listaBonifici = new ArrayList<>();
    }

    public Boolean effettuaBonifico() {
        if(Sistema.getPermission(this.conto_cliente, this.importo, "bonifico")){
            this.conto_cliente.updateSaldo(-this.importo);
            listaBonifici.add(this.data);
            return true;
        }
        return false;
    }

    public void viewBonifici(){
        for (Date d : listaBonifici) {
            System.out.println(d);
        }
    }
}
