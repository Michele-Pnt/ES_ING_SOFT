package Ing_Software.eserciziPersonali.es1_2503;

public class Spedizione {
    private int id;
    private String corriere;
    private String numeroTracking;

    public Spedizione(int id, String corriere, String numeroTracking) {
        this.id = id;
        this.corriere = corriere;
        this.numeroTracking = numeroTracking;
    }

    public String tracciaSpedizione() {
        return "Spedizione con corriere " + corriere + " - Tracking: " + numeroTracking;
    }
}