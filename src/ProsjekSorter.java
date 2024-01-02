import java.util.Comparator;

public class ProsjekSorter implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2){
        if(s1.getProsjek()>s2.getProsjek()){
            return 1;
        } else if (s1.getProsjek()<s2.getProsjek()) {
            return -1;
        }
        else{
            return 0;
        }
    }
}
