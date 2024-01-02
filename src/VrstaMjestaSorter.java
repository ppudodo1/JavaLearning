import java.util.Comparator;

public class VrstaMjestaSorter implements Comparator<VrstaMjesta> {
    public int compare(VrstaMjesta a, VrstaMjesta b){
        System.out.println("Usporedba: "+ a.compareTo(b)+" a: "+a+" b: "+b);
        return a.compareTo(b);
    }
}
