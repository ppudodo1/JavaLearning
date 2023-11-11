import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Integer> mapaUnesenihBrojeva = new HashMap<>();
        Scanner unos = new Scanner(System.in);
        for(int i = 0; i < 3; i++) {
            System.out.print("Unesite broj: ");
            Integer broj = unos.nextInt();
            if(mapaUnesenihBrojeva.containsKey(broj)) {
                Integer kolicina = mapaUnesenihBrojeva.get(broj);
                kolicina += 1;
                mapaUnesenihBrojeva.put(broj, kolicina);
            }
            else {
                mapaUnesenihBrojeva.put(broj, 1);
            }
        }
        System.out.println(mapaUnesenihBrojeva);
        unos.close();
        System.out.println("Test");
        for(Integer key : mapaUnesenihBrojeva.keySet()) {
            System.out.println(key + " " + mapaUnesenihBrojeva.get(key));
        }
    }

}