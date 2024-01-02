import java.util.Comparator;

public class CovidSorter implements Comparator<Covid19> {
    @Override
    public int compare(Covid19 o1, Covid19 o2){
        if(o1.getBrojZarazenih()>o2.getBrojZarazenih()){
            System.out.println("Prvi uvjet Grad1: "+o1.getMjestoZaraze() + " Grad2: "+o2.getMjestoZaraze() + " vracamo : " + o1.getMjestoZaraze().compareTo(o2.getMjestoZaraze()));
            return o1.getMjestoZaraze().compareTo(o2.getMjestoZaraze());
        } else if (o1.getBrojZarazenih()<o2.getBrojZarazenih()) {
            System.out.println("Drugi uvjet Grad1: "+o1.getMjestoZaraze() + " Grad2: "+o2.getMjestoZaraze()+ " vracamo : " + o2.getMjestoZaraze().compareTo(o2.getMjestoZaraze()));
            return o2.getMjestoZaraze().compareTo(o1.getMjestoZaraze());
        }else{
            System.out.println("Treci uvjet Grad1: "+o1.getMjestoZaraze() + " Grad2: "+o2.getMjestoZaraze()+ " vracamo : " + o1.getDatum().compareTo(o2.getDatum()));
            return o1.getDatum().compareTo(o2.getDatum());
        }
    }
}
