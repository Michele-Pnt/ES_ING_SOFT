public class Studente {
    private String nome;
    private String matricola;
    private int[] voti;

    public Studente(String nome, String matricola, int[] voti) {
        this.nome = nome;
        this.matricola = matricola;
        this.voti = voti;
    }

    public double media() {
        if (voti.length == 0) return 0;
        int somma = 0;
        for (int v : voti) somma += v;
        return (double)somma / voti.length;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricola() {
        return matricola;
    }
}