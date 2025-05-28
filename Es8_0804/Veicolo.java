package Es8_0804;

public class Veicolo {
    protected int id;
    protected String marca;
    protected String modello;
    protected String targa;
    protected String stato;
    protected String tipo_veicolo;
    protected int costo_giornaliero;

    public Veicolo(int id, String marca, String modello, String targa,  String tipo_veicolo,  int costo_giornaliero){
        this.id = id;
        this.marca = marca;
        this.modello = modello;
        this.targa = targa;
        this.stato = "disponibile";
        this.tipo_veicolo = tipo_veicolo;
        this.costo_giornaliero = costo_giornaliero;
    }

    public String getTipoVeicolo(){
        return this.tipo_veicolo;
    }

    public int getCosto(){
        return this.costo_giornaliero;
    }

    public String getStato(){
        return this.stato;
    }

    public void setStato(String s){
        this.stato = s;
    }
}
