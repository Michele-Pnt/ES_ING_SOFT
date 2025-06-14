import java.time.LocalDate;

public class VoceDiario {
    private String testo;
    private LocalDate data;

    public VoceDiario(String testo, LocalDate data) {
        this.testo = testo;
        this.data = data;
    }

    public LocalDate getData() {
        return data;
    }

    @Override
    public String toString() {
        return "[" + data + "] " + testo;
    }
}