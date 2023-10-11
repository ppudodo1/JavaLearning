# Lesson 2
## import deklaracije
- Java.lang deklaracije se ne moraju importati

## Primitivni i referentni tipovi
- Primitivni tipovi nisu klase i pocinju malim slovom, kao u C-u
- Java primitivnim tipovima dodjeljuje vrijednost 0
- Referentni tipovi tipovi podataka su svi oni tipovi koji imaju vlastitu klasu
- Svaki primitivni tip ima svoju _referentnu_ verziju
- Ako se referentni tipovi ne incijaliziraju onda poprima vrijednost `null`. Ovo zna dovesti do `nullPointerException` greske

## Pisanje konstruktora
- Metoda za kreiranje objekata (metode u Javi se pisu malim slovom);
- Mora imati isto ime kao klasa
- Nema povratni tip

Primjer:
```java
class Account{
    public Account(String name){
        this.name = name;
    }
}
```

## Date and Time API
- Java 8 uvodi novi `Date and Time API`
- Koristimo klase samo za datum, samo za vrijeme oboje itd.

Primjer:
```java
LocalDateTime time = LocalDateTime.now();
```

## Objekti i reference 
- Nakon sto se objekti deklariraju i ne dodijeli im se konkretna vrijednost onda imaju vrijednost null
- Kad kopiramo objekte moramo napisati posebni `copy` konstruktor jer ce inace imati istu memorijsku lokaciju sto moze rezultirati sa bugovima

Ovo ne bi smjeli koristiti kod usporedivanja objekata:
```java
if(firstDate==secondDate){}
```

## Klase
- Svaka klasa mora biti smijestena u svoj paket