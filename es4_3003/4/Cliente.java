class Cliente extends Persona{
    private String nome;
    private String id;
    

    public Cliente(String nome, int eta,String id) {
        super(nome,eta);
        this.id = id;
    }


    public String getID() {
        return id;
    }

    public void effettuaOrdine() {
    
        System.out.println("Ordine effettuato: " );
    }

    
}