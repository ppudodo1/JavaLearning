import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class Main {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>(asList(4,3,2,1));
        List<Integer> sameOrder = numbers.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sameOrder);
    }

}