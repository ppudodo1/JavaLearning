# Dodatne zbirke

## Primjer operacija sa suceljem Collection
```java
    Collection<String> kolekcija = new ArrayList<>();
        kolekcija.add("Prvi");
        kolekcija.add("Drugi");
        kolekcija.add("Treci");

        System.out.println("Sadrzaj: "+kolekcija);
        System.out.println("Velicina: "+kolekcija.size());
        System.out.println("Postoji li: "+kolekcija.contains("Drugi")); // provjera postoji li neki element
        // Uklanjanje elementa
        kolekcija.remove("Drugi element");
        Iterator<String> iterator = kolekcija.iterator(); // dohvacanje iterator objekta
        while (iterator.hasNext()){
            String el = iterator.next(); // vraca onaj objekt koji smo proslijedili kao genericki argument
            // u ovom slucaju to je String, ali moze biti Integer, Double, Float itd.
            System.out.println(el);
        }
```

## Primjer operacija sa klasom Collections
```java
        List<String> kolekcija = new ArrayList<>();
        kolekcija.add("Prvi");
        kolekcija.add("Drugi");
        kolekcija.add("Treci");

        Collections.sort(kolekcija); // ova metoda sortira listu na mjestu odnosno mijenja vec postojecu listu
        // a ne vraca nista odnoso void
        Collections.reverse(kolekcija); // ova metoda je isto kao sort samo obrnuto
        Collections.shuffle(kolekcija); // ova metoda mijesa elemente u mjestu i ne vraca nista
        String maxA = Collections.max(kolekcija); // nalazi max element u listi i vraca genericki parametar
        String minA = Collections.min(kolekcija); // Isto kao max samo za minimum

        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(30);
        numbers.add(50);

        Collections.sort(numbers);

        // Trazenje indexa sa Binary Search
        int key = 30;
        int index = Collections.binarySearch(numbers, key); // vraca int
        if (index >= 0) {
            System.out.println(key + " found at index " + index);
        } else {
            System.out.println(key + " not found in the list");
        }
        // Popunjavanje zbirke
        Collections.fill(numbers,10);// ne vraca nista, baca error ako se koristi krivi tip podatka
        // Popunit ce cijelu zbirku sa 10, odnosno svi postojeci elementi ce biti 10
        // Kopiranje elemenata iz jedne zbirke u drugu
        // Kada radimo kopiju neke zbirke u konstruktoru moramo deklarirati velicinu originalne liste te koji
        // tip parametra originalna lista prima
        List<Integer> destinationList = new ArrayList<>(Collections.nCopies(numbers.size(),0));
        Collections.copy(destinationList,numbers);
        System.out.println(destinationList);
        // Broj pojavljivanja nekog elementa u zbirci
        Collections.frequency(numbers,10); // vraca int
        // provjera imaju li liste iste elemente
        Collections.disjoint(numbers,destinationList); // Vraca true jedino ako liste ne sadrze zajednicke elmente
        // inace vraca false
```

## Liste
- Primjeri deklaracije razlicitih lista u javi.
```java
        // diamond operator uveden od Jave SE 7
        List<String> test = new ArrayList<>();
        List<String> test2 = new ArrayList<String>();
        List<> test = new ArrayList<String>(); // ovo se ne smije raditi
        List<String> test3 = new Vector<>();
        List<String> test4 = new LinkedList<>();
```

## Sortiranje

- Klase kojima je dozvoljeno sortiranje: ArrayList, LinkedList, Vector i TreeMap.

## Primjer enumeracija u javi:

```java
package org.example;

import org.example.NekaKlasa;

import java.awt.*;
import java.io.*;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}
public class Main {
    public static void main(String[] args)  {
        Day today = Day.WEDNESDAY;

        // Switch statement with enum
        switch (today) {
            case MONDAY:
                System.out.println("It's Monday!");
                break;
            case WEDNESDAY:
                System.out.println("It's Wednesday!");
                break;
            case FRIDAY:
                System.out.println("It's Friday!");
                break;
            default:
                System.out.println("It's not Monday, Wednesday, or Friday.");
        }

        // Iterating over all values in the enum
        System.out.println("Days of the week:");
        for (Day day : Day.values()) {
            System.out.println(day);
        }

    }

}
```

## Tokovi
```java
List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        // filtiranje
        List<Integer> evenNumbers = numbers.stream()
                .filter(num -> num %2==0)
                .collect(Collectors.toList());
        List<Integer> uniqueNumbres = numbers.stream()
                .distinct()
                .toList(); // collect(Collectors.toList()) i toList() oboje vracaju List<>
        // Koristenje limita
        List<Integer> limitedNumbers = numbers.stream()
                .limit(5)
                .toList();
        // Koristenje mape za mapiranje square vrijednosti
        List<Integer> squaredNumbers = numbers.stream()
                .map(num -> num * num)
                .toList();
        // Sortiranje elemenata
        List<Integer> sortedNumbers = numbers.stream()
                .sorted()
                .toList();
        // Ispisivanje elemenata sa forEach
        numbers.stream()
                .forEach(System.out::println);
        // koristenje average
        OptionalDouble average = numbers.stream()
                .mapToDouble(Integer::doubleValue)
                .average();// average Vraca OptionalDouble
        // Koristenje preborjavanja
        long count = numbers.stream()
                .count(); // count vraca long

        OptionalDouble min = numbers.stream()
                .mapToDouble(Integer::doubleValue)
                .min(); // ovo isto vraca OptionalDouble
        // reduce da mozemo dobiti sumu elemenata
        int sum = numbers.stream()
                .reduce(0, Integer::sum);
        // findAny i findFirst vracaju Optional tip objekta
        Optional<Integer> any = numbers
                .stream()
                .findAny();
        boolean anyM = numbers
                .stream()
                .anyMatch(num->num>5); // anyMatch i allMatch vracaju boolean
```

## Compare sucelje
```java
package org.example;

import java.util.Comparator;

public class ProsjekSorter implements Comparator<Student> {
    @Override
    public int compare(Student st1, Student st2) {
        if(st1.getProsjek() > st2.getProsjek()) {
            return 1;
        }
        else if (st1.getProsjek() < st2.getProsjek()) {
            return -1;
        }
        else {
            return 0;
        }
    }
}
package org.example;

public class Student {
    private String prezime;
    private String ime;
    private String jmbag;
    private double prosjek;
    //izostavljene "getter" metode i konstruktor


    public Student(String prezime, String ime, String jmbag, double prosjek) {
        this.prezime = prezime;
        this.ime = ime;
        this.jmbag = jmbag;
        this.prosjek = prosjek;
    }

    @Override
    public String toString() {
        return prezime + " " + ime + "(" + prosjek + ")";
    }

    public String getPrezime() {
        return prezime;
    }

    public String getIme() {
        return ime;
    }

    public String getJmbag() {
        return jmbag;
    }

    public double getProsjek() {
        return prosjek;
    }
}
package org.example;

import org.example.NekaKlasa;

import java.awt.*;
import java.io.*;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


public class Main {
    public static void main(String[] args)  {
        Student prvi = new Student("Perić", "Pero", "0240293832", 4.11);
        Student drugi = new Student("Ivić", "Ivo", "0240212322", 3.82);
        Student treci = new Student("Markić", "Marko", "0240297890", 4.78);
        Student cetvrti = new Student("Horvat", "Ivan", "0240294345", 3.05);
        List<Student> listaStudenata = new ArrayList<>();
        listaStudenata.add(prvi);
        listaStudenata.add(drugi);
        listaStudenata.add(treci);
        listaStudenata.add(cetvrti);
        Collections.sort(listaStudenata, new ProsjekSorter());
        System.out.println(listaStudenata);
    }

}
```