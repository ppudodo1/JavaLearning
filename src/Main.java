import noviPaket.Mod;

import java.io.*;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Arrays.asList;


public class Main {

    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("./dats/citaj.txt"))){
                String procitano = reader.read();
                System.out.println(procitano);
        }catch ( IOException e){
            e.printStackTrace();
        }
    }



}



