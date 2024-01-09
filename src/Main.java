import noviPaket.Mod;

import java.io.*;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.nio.file.DirectoryStream;
import static java.util.Arrays.asList;


public class Main {

    public static void main(String[] args) throws IOException {





        Path path = Path.of("dats/citaj.txt");
        Path directoryPath = Path.of("./dats");
        // dohvacanje svih linija datoteke na nekoj putanji
        try (Stream<String> lines = Files.lines(path)) {
            lines.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // citanje datoteka u nekom direktoriju
        try (Stream<Path> files = Files.list(directoryPath)) {
            files.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //otvaranje mapa i omogucava citanje njenog sadrzaja
        try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(directoryPath)) {
            directoryStream.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //Otvaranje mapa i podmapa u hijerarhiji
        try (Stream<Path> walk = Files.walk(directoryPath)) {
            walk.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // citanje cijele dataoteke pomocu readString metode
        try {
            String content = Files.readString(path);
            System.out.println(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // filtriranje datoteka na zadanoj putanji
        try (Stream<Path> files = Files.list(directoryPath)) {
            files.filter(Files::isRegularFile)
                    .filter(path1 -> path1.toString().endsWith(".txt"))
                    .forEach(System.out::println);
        }
    }



}



