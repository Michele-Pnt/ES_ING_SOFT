public class Squadra implements Comparable<Squadra> {
    private String nome;
    private int punti;

    public Squadra(String nome, int punti) {
        this.nome = nome;
        this.punti = punti;
    }

    public int getPunti() {
        return punti;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public int compareTo(Squadra o) {
        return o.punti - this.punti; // decrescente
    }
}