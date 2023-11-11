import java.util.Comparator;

public class MojKomparator implements Comparator<Automobil> {
    public int compare(Automobil prvi, Automobil drugi) {
        if (prvi.getBrzina() < drugi.getBrzina()) {
            return -1;
        }
        else if (prvi.getBrzina() > drugi.getBrzina()) {
            return 1;
        }
        else {
            return 0;
        }
    }
}
