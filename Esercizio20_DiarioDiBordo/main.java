import java.time.LocalDate;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<VoceDiario> diario = new ArrayList<>();
        diario.add(new VoceDiario("Iniziato nuovo progetto.", LocalDate.now().minusDays(1)));
        diario.add(new VoceDiario("Giornata produttiva!", LocalDate.now().minusDays(3)));
        diario.add(new VoceDiario("Riposo.", LocalDate.now().minusDays(10)));

        LocalDate oggi = LocalDate.now();
        System.out.println("Voci degli ultimi 7 giorni:");
        for (VoceDiario voce : diario) {
            if (voce.getData().isAfter(oggi.minusDays(7))) {
                System.out.println(voce);
            }
        }
    }
}