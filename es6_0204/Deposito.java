package es6_0204;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Deposito extends Operazione{
    List <Date> listaDepositi;
    
    public Deposito(String nome_o, Double importo, Date data, Cliente c){
        super(nome_o, importo, data, c);
        listaDepositi = new ArrayList<>();
    }

    public Boolean effettuaDeposito() {
        if(Sistema.getPermission(this.conto_cliente, this.importo, "deposito")){
            this.conto_cliente.updateSaldo(this.importo);
            listaDepositi.add(this.data);
            return true;
        }
        return false;
    }

    public void viewDepositi(){
        for (Date d : listaDepositi) {
            System.out.println(d);
        }
    }
}
