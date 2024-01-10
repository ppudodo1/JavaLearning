import noviPaket.Mod;

import java.io.*;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Arrays.asList;


public class Main {

    public static void main(String[] args) throws IOException {
        Path path = Path.of("./dats/citaj.txt");
        // Svi primjeri citanja, pisanja, kopiranja tekstualnih i binarnih datoteka
        //Tekstualne - citanje 1 nacin
        try(BufferedReader in = new BufferedReader(new FileReader(String.valueOf(path)))){
                String line;
                Stream<String> lin = in.lines();
                List<String> list = lin.collect(Collectors.toList());
                System.out.println("Streamovi");
                System.out.println(list); // ispis [Programiranje, u, ježiku, Java]
                while((line = in.readLine())!=null){
                    System.out.println(line);
                }
        }catch (IOException e){

        }
        //Tekstualne - citanje 2 nacin
        String cijeliFile = Files.readString(path);
        System.out.println(cijeliFile);

        // Teksutalne - citanje 3. nacin
        // Ovaj nacin se koristi kod binarnih datoteka jer se one citaju po vrijednosti bajtova
        // Ovdje takoder imamo problem sto nemamo definiran charSet pa se sve vrijednosti ne ispisuju dobro
        try (FileInputStream in = new FileInputStream(String.valueOf(path))){
            int procitani;
                while ((procitani = in.read())!=-1){
                    char character = (char) procitani;
                    System.out.print(character);
                }
        }catch (IOException e){

        }
        // Tekstutalne zapisivanje 1- nacin
        // Kada ovo napravimo samo nam rewritea cijelu datoteku
        try(BufferedWriter out = new BufferedWriter(new FileWriter(String.valueOf(path)))){

                String neki = "Neki string za zapisati u datoteku";
                out.write(neki);
        }catch (IOException e){

        }
        // Tekstutalne zapisivanje 2- nacin
        // Kada stavimo drugi element konstruktora FileWritera na true onda omogocuvamo appendanje elemenata na kraj datotek
        try(BufferedWriter out = new BufferedWriter(new FileWriter(String.valueOf(path),true))){
            // Kada ovo napravimo samo nam rewritea cijelu datoteku
            String neki = "Neki string za zapisati u datoteku";
            out.newLine();
            out.write(neki);
            out.newLine();
        }catch (IOException e){

        }
        // Tekstualne zapisivanje 3- nacin, ovaj nacin nam isto rewritea cijelu datoteku
        String cijeliStrin = "Daj upisi mi cijeli String u datoteku odjednom";
        Files.writeString(path,cijeliStrin);
        // Tekstualne zapisivanje 4- nacin, kada dodamo StandardOpenOption.APPEND onda nam nece vise rewriteati cijelu datoteku
        String cijeliString = "Daj upisi mi cijeli String u datoteku odjednom";
        Files.writeString(path,cijeliString, StandardCharsets.UTF_8, StandardOpenOption.APPEND);
        // Tekstualne zapisivanje 5 - nacin ovdje isto vrijedi vrijednost u konstruktoru ako zelimo appendati na kraj datoteke
        try(FileOutputStream out = new FileOutputStream(String.valueOf(path),true)){
                int upisani;

                String stringKojiTribaUpisat  = " When someone says to you imaš dobra jaja it means you have good balls";
                //Prvo moramo pretvoriti string u bajtove jer FileOutputStream objekt koristi bajtove za zapisivanje u datoteku
                byte[] bytes = stringKojiTribaUpisat.getBytes(Charset.forName("UTF-8")); // ovdje takoder mozemo definirati koji cemo charSet koristiti
                out.write(bytes);

        }catch (IOException ex){

        }
        // Tekstualne zapisivanje 6. nacin
        // PrintWriter se uglavnom koristi kada trebamo formatirati tekst koji zapisujemo u datoteku
        try(PrintWriter in = new PrintWriter(new FileWriter(String.valueOf(path),true))){
                System.out.println("String sa printWriterom");
                in.println("Nig");
        }

        //Binarne datoteke zapisivanje
        Path binarna = Paths.get("./dats/binarna.bin");
        Path binarna2 = Paths.get("./dats/binarna2.bin");
        //System.out.println(Files.exists(binarna));
        try(FileOutputStream out = new FileOutputStream(String.valueOf(binarna),true)){
            String zap = "Zapiši\n";
            byte[] bytes = zap.getBytes(Charset.forName("UTF-8"));
            out.write(bytes);
        }catch (IOException ex){

        }
        // Binarne datoteke citanje
        try(FileInputStream in = new FileInputStream(String.valueOf(binarna))){
            // Da bi ovdje definirali charSet mozemo napraviti ovo
                InputStreamReader inputStreamReader = new InputStreamReader(in,Charset.forName("UTF-8"));
                // i onda u while-u za citanje koristimo ovaj inputStreamReader umjesto in (objekta klase FileInputStream)
                int procitani;
                while((procitani = in.read())!=-1){
                    char character = (char) procitani;
                    System.out.print(character);
                }
        }catch (IOException ex){

        }
        // Binarne datoteke kopiranje 1. nacin
        try(FileInputStream in = new FileInputStream(String.valueOf(binarna));
            FileOutputStream out = new FileOutputStream(String.valueOf(binarna2))
        ){
            int procitani;
            while((procitani = in.read())!=-1){
                    out.write(procitani);
            }
        }catch (IOException e){

        }
        // Binarne datoteke kopiranje 2. nacin
        // Prvo treba izbrisati odredisnu datoteku jer ce inace baciti exception FileAlreadyExistsException
        Files.delete(binarna2);
        Files.copy(binarna,binarna2);
        // Tekstualne datoteke se mogu kopirati na iste nacine
    }

}



