import java.util.*;
class Staff extends Persona{
    String matricola;


    public Staff(String nome, int eta, String matricola ) {
        super(nome,eta);
        this.matricola=matricola;
        
    }

    // Metodo per aggiungere un piatto al menu
    public void aggiungiPiattoAlMenu(List<Piatti> menu,String nome, double prezzo) {
        menu.add(new Piatti(nome, prezzo));
    }


}
