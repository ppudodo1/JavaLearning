public class Student {
    private String prezime;
    private String ime;
    private String jmbag;
    private double prosjek;

    public Student(String prezime, String ime, String jmbag, double prosjek) {
        this.prezime = prezime;
        this.ime = ime;
        this.jmbag = jmbag;
        this.prosjek = prosjek;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getJmbag() {
        return jmbag;
    }

    public void setJmbag(String jmbag) {
        this.jmbag = jmbag;
    }

    public double getProsjek() {
        return prosjek;
    }

    public void setProsjek(double prosjek) {
        this.prosjek = prosjek;
    }
    @Override
    public String toString(){
        return prezime + " " +ime +"(" +prosjek+ ")";
    }
}
