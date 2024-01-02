import java.time.LocalDateTime;

public class Covid19 {
    private String mjestoZaraze;
    private Integer brojZarazenih;
    private LocalDateTime datum;

    public Covid19(String mjestoZaraze, Integer brojZarazenih, LocalDateTime datum) {
        this.mjestoZaraze = mjestoZaraze;
        this.brojZarazenih = brojZarazenih;
        this.datum = datum;
    }

    public String getMjestoZaraze() {
        return mjestoZaraze;
    }

    public void setMjestoZaraze(String mjestoZaraze) {
        this.mjestoZaraze = mjestoZaraze;
    }

    public Integer getBrojZarazenih() {
        return brojZarazenih;
    }

    public void setBrojZarazenih(Integer brojZarazenih) {
        this.brojZarazenih = brojZarazenih;
    }

    public LocalDateTime getDatum() {
        return datum;
    }

    public void setDatum(LocalDateTime datum) {
        this.datum = datum;
    }
}
