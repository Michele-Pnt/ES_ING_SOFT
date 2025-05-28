import java.util.ArrayList;

public class Menu {
    private ArrayList <Piatto> menu;

    public Menu(){
        this.menu = new ArrayList<>();
    }

    public void aggiungiAMenu(Piatto p){
        this.menu.add(p);
    }

    public void rimuoviAMenu(Piatto p){
        this.menu.remove(p);
    }

    public void viewMenu(){
        for(Piatto m : menu){
            System.out.println(m.getNome());
        }
    }
}
