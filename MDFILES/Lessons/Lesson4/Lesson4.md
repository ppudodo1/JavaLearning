# Lesson 4

## Zbirke podataka
- Collection => osnovno sucelje u hijerarhiji zbirki iz kojeg su nasljedenje zbirke 
`Set` i `List`
- Set => sucelje zbirke koje ne moze sadrzavati duplikate
- List => sucelje zbirke koje moze sadrzavati duplikate i cuva poredak elemenata
- Map => sucelje zbirke koje pohranjuje _parove_ "kljuc-vrijednost",pri cemu kljucevi
ne mogu imati duplikate

### NE MOGU SADRZAVATI PRIMITIVNE TIPOVE PODATAKA   


## Sucelje collection
- Sadrzi skupine operacija koje se izvode nad zbirkom, ima _metode_
koje omogucavaju lakse manipuliranje zbirkom. (Nesto kao `vector` u c++
 ili obican `array` u JS-u)


## Liste
Poredana zbirka koja moze sadrzavati vise referenci istog objekta

Najcesce implementacije `List` su:
- ArrayList => promjenjiva struktura polja
- LinkedList
- Vector => promjenjiva struktura polja

**Primjer koristenja `ArrayList` implementacije**:

```java

import java.util.Iterator;

public class Main {
 public static void main(String[] args) {
  String[] poljeStringova = {"Proljece", "Ljeto", "Jesen", "Zima"};
  List<String> lista = new ArrayList<>();
  //foreach petlja
  for (String doba : poljeStringova) {
   lista.add(doba);
  }
  Iterator<String> iterator = lista.iterator();
  while(iterator.hasNext()){
      System.out.println(iterator.next());
  }
  // ili mozemo i na ovaj nacin ispisati vrijednosti
  for(String doba:lista){
      System.out.println(doba);
  }
 }
}
```
**Primjer koristenja `LinkedList` implementacije**:

```java
 import java.util.Iterator;
import java.util.LinkedList;

public class Main {
 public static void main(String[] args) {
  String[] poljeStringova = {"Proljece", "Ljeto", "Jesen", "Zima"};
  List<String> lista = new LinkedList<>();
  for (String doba:poljeStringova){
      lista.add(doba);
  }
  for(String doba : lista){
      System.out.println(doba);
  }
  // metoda za manipuliranje listom, slicno kao u JS-u
  String pop = ((LinkedList<String>lista)).pop();
  System.out.println(pop);//Proljece smo izbacili
  String prvi = ((LinkedList<String> lista)).getFirst();
  System.out.println(prvi); //Ljeto je prvo jer vise nema proljeca
 }
}
```
**Koristenje metoda iz klase `Collections`**:

```java
 import java.util.*;

public class Main {
 public static void main(String[] args) {
   String[] poljeStringova = {"Proljece", "Ljeto", "Jesen", "Zima"};
   List<String> lista = Arrays.asList(poljeStringova);
   System.out.println(lista);
   Collections.sort(lista);
   int broj = Collections.frequency(lista,"Ljeto");

 }
}
```

## Setovi
Set je zbirka koja ne cuva poredak i sadrzava samo po jednu referencu odredenog objekta.
Umetanje elementa koji vec postoji zamjenjuje stari element iz seta. Najcesce implementacije
sucelja `Set` su `HashSet` i `TreeSet`.

## Mape
Zbirke koje povezuju kljuceve sa vrijednostima.

Najcesce implementacije sucelja `Map` su:
- HashTable
- HashMap
- TreeMap

**Primjer koristenja `HashMap` implementacije**:

```java
 import java.util.*;

public class Main {
 public static void main(String[] args) {
  Map<Integer,Integer> mapa = new HashMap<>();
  Scanner unos = new Scanner(System.in);
  for(int i = 0;i<10;i++){
      System.out.println("Unesite broj: ");
      Integer broj = unos.nextInt();
      if(mapa.containsKey(broj)){
          Integer kolicina = mapa.get(broj);
          kolicina++;
          mapa.put(broj,kolicina);
      }else{
          mapa.put(broj,1);
      }
  }
  System.out.println(mapa);  
 }
}
```

## Enumeracije
Enumeracije je tip podatka koja sadrzi pobrojani niz konstanti. To su referentni tipovi
koji mogu imati konstruktor i varijable. 

**Primjer koristenja Enumeracije**:
```java
import java.util.*;
public enum StatusObrade{
    USPJESNA_OBRADA(1,"Uspjesno obradene sve transakcije"),
    TIMEOUT(2,"Isteklo vrijeme trajanja"),
    NEISPRAVNI_PODATCI(3,"Krivo uneseni podatci");
    private Integer kod;
    private String opis;
    private StatusObrade(Integer kod, String opis){
        this.kod = kod;
        this.opis = opis;
    }
    
}


public class Main {
 public static void main(String[] args) {
     String[] poljeStringova = {"Proljece", "Ljeto", "Jesen", "Zima"};
     List<String> lista = new LinkedList<>();
        for (String doba:poljeStringova){
        lista.add(doba);
     }
        StatusObrade status = StatusObrade.USPJESNA_OBRADA;
        switch (status){
         case USPJESNA_OBRADA:
             System.out.println("Poruka 1");
             break;
         case TIMEOUT:
          System.out.println("Poruka 2");
          break;
         case NEISPRAVNI_PODATCI:
          System.out.println("Poruka 3");
          break;
        }
 }  
}
```

## Tokovi u Javi
Tokovi su slicni iteratorima za manipuliranje elementima u zbirci. Omogucuju paralelno
obradivanje podataka cime znatno poboljsavaju performanse. Svaka zbirka ili polje ima 
mogucnost pozivanja metode `stream` i nad dobivenim tokom obavljati operacije.

**Primjer koristenja `IntStream` operacija (arrow funkcija iz JS-a)**:

```java
import java.util.stream.IntStream;

public class Main {
 public static void main(String[] args) {
  int[] brojevi = {8, 10, 4, 9, 5, 7, 1, 3};
  IntStream.of(brojevi).forEach(vrijednost -> System.out.println(vrijednost + " "));
  System.out.println(IntStream.of(brojevi).count());// broj elemenata
  System.out.print(IntStream.of(brojevi).reduce(0, (x, y) -> x + y));
  System.out.print("Sortirani parni brojevi: ");
  IntStream.of(brojevi).filter(vrijednost -> vrijednost % 2 == 0)
          .sorted()
          .forEach(vrijednost -> System.out.print(vrijednost + " "));
 }
}
```
## Sucelje `Comparator`
Za definiranje specificnih kriterija sortiranja moguce je koristiti sucelje
`Comparator`. Ono sadrzi samo jednu apstraktnu metodu `compare ` koja 
prima dva objekta i definira njihov odnos koji se koristi kod sortiranja.

**Primjer implementacija sucelja `Comparator`**:

```java
import java.util.Comparator;

public class Student {
 private String prezime;
 private String ime;
 private String jmbag;
 private double prosjek;
public Student(String prezime,String ime, String jmbag, double prosjek){
    this.prezime=prezime;
    this.ime = ime;
    this.jmbag=jmbag;
    this.prosjek = prosjek;
}
 // izostavljene getter metode i konstruktor
 public double getProsjek(){
     return  prosjek;
 }
 public String toString() {
  return prezime + " " + ime + "(" + prosjek + ")";

 }
}

public class ProsjekSorter implements Comparator<Student>{
    @Override
    public int compare(Student s1, Student s2){
        if(st1.getProsjek()> st2.getProsjek()){
            return 1;
        }else if (st1.getProsjek()<st2.getProsjek()){
            return -1;
        }else{
            return 0;
        }
    }
}

// primjer koristenja sa ArrayListom
public class Main {
 public static void main(String[] args) {
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
```java
import java.util.Comparator;

public class Student {
 private String prezime;
 private String ime;
 private String jmbag;
 private double prosjek;
public Student(String prezime,String ime, String jmbag, double prosjek){
    this.prezime=prezime;
    this.ime = ime;
    this.jmbag=jmbag;
    this.prosjek = prosjek;
}
 // izostavljene getter metode i konstruktor
 public double getProsjek(){
     return  prosjek;
 }
 public String toString() {
  return prezime + " " + ime + "(" + prosjek + ")";

 }
}

public class ProsjekSorter implements Comparator<Student>{
    @Override
    public int compare(Student s1, Student s2){
        if(st1.getProsjek()> st2.getProsjek()){
            return 1;
        }else if (st1.getProsjek()<st2.getProsjek()){
            return -1;
        }else{
            return 0;
        }
    }
}

// primjer koristenja sa TreeSetom
public class Main {
 public static void main(String[] args) {
  Student prvi = new Student("Perić", "Pero", "0240293832", 4.11);
  Student drugi = new Student("Ivić", "Ivo", "0240212322", 3.82);
  Student treci = new Student("Markić", "Marko", "0240297890", 4.78);
  Student cetvrti = new Student("Horvat", "Ivan", "0240294345", 3.05);
  SortedSet<Student> setStudenata = new TreeSet<>(new ProsjekSorter());
  setStudenata.add(prvi);
  setStudenata.add(drugi);
  setStudenata.add(treci);
  setStudenata.add(cetvrti);
 }
}



```