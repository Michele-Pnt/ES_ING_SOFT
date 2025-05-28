public class Test {
    public static void main(String[] args) {
        // Create a new Ristorante object
        Ristorante ristorante = new Ristorante("La Dolce Vita", "Via Roma 123");
        
        // Create a new Cliente object
        Cliente cliente = new Cliente("Mario Rossi", 30, "C12345");
        
        // Create a new Piatti object
        Piatti piatto = new Piatti("Pasta al Pomodoro", 12.50);
        
        // Create a new Staff object
        Staff staff = new Staff("Giovanni Bianchi", 35, "M12345");
        Menu menu = new Menu();
        // Add a piatto to the menu using staff
        staff.aggiungiPiattoAlMenu(menu.getMenu(), piatto.getNome(), piatto.getPrezzo());
        // Print the menu
        System.out.println("Menu del ristorante:");
        menu.visualizzaMenu();

        // Create a new Ordine object
        Ordine ordine = new Ordine(cliente);
        ordine.aggiungiPiatto(piatto);
        ordine.VisualizzaOrdine();
        ordine.aggiornaStato("In preparazione");

     




    }
    
}
