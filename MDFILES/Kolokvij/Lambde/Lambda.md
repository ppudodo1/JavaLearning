# Lambda izrazi u Javi
Lamdba izrazi su korisni jer se odredeni kod moze smanjiti i olaksati nam posao.

Primjer jednostavnog koristenja lambde za filtriranje, mapiranje i trazenje max ocjene studenata
odredene godine:
```java
List <Student> students;
double highScore = students.stream()
        .filter(Student s -> s.getGradYear()==2011)
        .map(Studen s -> s,getScore())
        .max();
```
Sintaksa lambda izraza:
![img.png](img.png)

## Funkcionalna sucelja
![img_1.png](img_1.png)

## Funkcionalno sucelje `Predicate`
- `Predicate` predstavlja `Boolean` vrijednost funkcije s jednim argumentom
- Primjer :
```java
Studen s -> s.graduationYear()==2011
```

## Funkcionalno sucelje `Consumer<T>`
- Operacija koja prima jednu vrijednost i ne vraca rezultat
- Omogucava ulancavanje funkcija koristenjem naredbe `andThen(Consumer after)`
- Primjer: 
```java
String s -> System.out.println(s);
(k,v) -> System.out.println("key: "+ k + ", value:" +v);
```
## Funkcionalno sucelje `Function<T>`
- Prima jedan argument i vraca rezultat
- Moze primati i vracati razlicite tipove parametara
- Omogucava koristenje statickih metoda za ulancavanje `compose` i `andThen`
- Primjer:
```java
Student s -> s.getName()
```
## Funkcionalno sucelje `UnaryOperator<T>`
- Specijalni obli `Function` sucelja
- Prima jedan paramater i vraca isti tip paramtera
- Primjer
```java
String s - > s.toLowerCase();
```
## Funkcionalno sucelje `BinaryOperator<T>`
- Specijalni oblik `Function` sucelja
- Prima dva paramtera i vraca isti tip paramtera
-Primjer:
```java
(String, String y)->{
    if(x.length() > y.length())
        return x;
    return y;
}
```
## Vrijednosti u lambda izrazima
- Parametri lambda funkcija se ponasaju kao da imaju `final` modifikatorž
- **Effectively final** izraz podrazumijeva da se varijabli samo jednom moze dodijeliti
vrijednost ako se koristi u lambda izrazu

## Tokovi
`Stream pipeline` se sastoji od tri elementa:
- Izvora
- Nula ili vise `intermediate` operacija
- `Terminal` operacije
![img_2.png](img_2.png)
- Metoda `stream` vraca sucelje tipa `Stream` koje sadrzi metode za obavljanje kompleksnih
operacija nad zbirkama koristenje interne iteracije
- `lazy` operacije se ne izvrasavaju odmah dok se `eager` operacije izvrsavaju odmah
- Osnovna razlika između „lazy” i „eager” operacija je u tome sto one vracaju: ako metoda vraca „Stream”, onda je „lazy”, a ako ne vraca
  ništa, onda je „eager”

## Optional
- Predstavlja novi tip podatka koji predstavlja bolju alternativu od `null` vrijednosti
- Optional je zapravo samo neka kutija koja moze i ne mora sadrzavati nas objekt
- Ako vrijednost naseg objekt nije `null` onda se nalazi u kutiji zvanoj `Optional` inace
je obrnuto