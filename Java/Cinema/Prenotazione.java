package Java.Cinema;
public class Prenotazione {
    private Film f;
    private Sala s;
    
    public Prenotazione(Film f, Sala s){
        if(s.getPosti() > 0){
            this.f = f;
            this.s = s;

        }else{
            System.out.println("posti terminati");
        }
    }


}
