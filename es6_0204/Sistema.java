package es6_0204;

public class Sistema {
    public static Boolean getPermission(Cliente c, Double importo, String operazione){
        if(operazione.equals("deposito")){
            if(importo < 500){
                return true;
            }
            return false;
        }
        if(operazione.equals("prelievo")){
            if(importo < c.getSaldo()){
                return true;
            }
            else return false;
        }
        if(operazione.equals("bonifico")){
            if(importo < c.getSaldo()){
                return true;
            }
            else return false;
        }
        return false;
    }
}
