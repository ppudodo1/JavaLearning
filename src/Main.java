import noviPaket.Mod;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class Main {

    public static void main(String[] args) {
        Integer[] polje = {5, 23, 2, 324, 123, 4321};
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>(); // Initialize b with the same size as a
        for (Integer p : polje) {
            a.add(p);
            b.add(p);
        }
        /*for (int i = 0; i < polje.length; i++) {
            b.add(null);  // Add null as a placeholder
        }*/
       // b.ensureCapacity(a.size());

        System.out.println( Collections.disjoint(b,a));


    }


}