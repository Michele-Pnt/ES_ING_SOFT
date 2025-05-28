package Ing_Software.eserciziPersonali.es1_2503;

public class Spedizione {
    private int id;
    private String corriere;
    private String numeroTracking;

    public Spedizione(int id, String corr, String numCorr){
        this.id = id;
        this.corriere = corr;
        this.numeroTracking = numCorr;
    }

    public String tracciaSpedizione(){
        String s = new String();
        return s;
    }
}
