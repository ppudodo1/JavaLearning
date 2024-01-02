import java.time.LocalDate;

public class Temperatura {
    private LocalDate datum;
    private float temperatura;

    public Temperatura(LocalDate datum, float temperatura) {
        this.datum = datum;
        this.temperatura = temperatura;
    }

    public LocalDate getDatum() {
        return datum;
    }

    public float getTemperatura() {
        return temperatura;
    }
}
