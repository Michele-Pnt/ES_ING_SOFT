package es6_0204;

public class Cliente {
    private String nome;
    private String cognome;
    private String iban;
    private String email;
    private int telefono;
    private Double saldo;

    public Cliente(String n, String c, String i, String e, int t, Double s){
        this.nome = n;
        this.cognome = c;
        this.iban = i;
        this.email = e;
        this.telefono = t;
        this.saldo = s;
    }

    public String getNome(){
        return this.nome;
    }

    public String getIban(){
        return this.iban;
    }

    public void viewSaldo(){
        System.out.println(this.saldo);
    }

    public Double getSaldo(){
        return this.saldo;
    }

    public void updateSaldo(double update){
        this.saldo += update;
    }
}
