import noviPaket.Mod;

public class Automobil extends Mod {
    private float brzina;
    int test;
    public Automobil(float brzina, int test) {
        super(test);
        this.brzina = brzina;
    }
    public float getBrzina() {
        return brzina;
    }
}
