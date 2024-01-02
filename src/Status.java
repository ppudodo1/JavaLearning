public enum Status {
    USPJESNA_OBRADA(1, "Uspješno obrađene sve transakcije"),
    TIMEOUT(2, "Neuspješna obrada, isteklo maksimalno vrijeme trajanja"),
    NEISPRAVNI_PODACI(3, "Neuspješna obrada, neispravni podaci u transakcijama");
    private Integer kod;
    private String opis;

    private Status(Integer kod, String opis) {
        this.kod = kod;
        this.opis = opis;
    }
}
