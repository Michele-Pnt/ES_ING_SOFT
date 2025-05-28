import java.util.ArrayList;

public class Menu {
    private ArrayList<Piatti> menu;

    public Menu() {
        this.menu = new ArrayList<>();
        
    }
    
    // Metodo per visualizzare il menu
    public void visualizzaMenu() {
        System.out.println("Menu del Ristorante:");
        for (Piatti piatto : menu) {
            System.out.println(piatto);
        }
    }

    public ArrayList<Piatti> getMenu() {
        return menu;
    }
}
