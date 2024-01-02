import java.util.Comparator;

public class TemperaturaComparator implements Comparator<Temperatura> {
    @Override
    public int compare(Temperatura t1, Temperatura t2){
        if(t1.getDatum().isAfter(t2.getDatum())){
            return -1;
        }else if(t1.getDatum().isBefore(t2.getDatum())){
            return 1;
        }
        else{
            return 0;
        }
    }
}
