# Klase i objekti

Primjer klase imena `Account`:

```java
public class Account{
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
```
Elementi oznaceni modifikatorom `private` mogu se koristit samo unutar svoje klase.
Parameter metode `setName` je lokalni parametar te se moze koristit samo unutar te metode.
Za razlikovanje parametara i istoimene varijable instance koristi se kljucna rijec `this`.

## Konvencija za razlikovanja klasa objekata i metoda (_Camel Case_):
- Nazivi klasa moraju pocinjati velikim slovom
- Nazivi objekata i metoda moraju pocinjati malim slovom

NPR: 

Klasa: _PrvaLaboratorijskaVjezba_

Ime objekta: _brojacStudenata_

## Kreiranja objekata neke klase
- Objekte je moguce kreirati pozivom `konstruktora` odnosno metode istog imena kao i klasa 
koja sluzi za kreiranje objekta
- Konstruktor se poziva kljucnom rijecju `new`
- Ako se ne napise konstruktor unutar klase _compiler_ generira `defaultni` konstruktor bez 
parametara i ne inicijalizira varijable
- Ako se napise vlastiti konstruktor, objekte klase je potrebno kreirati koristenjem tog 
konstruktora (defaultni vise nije moguce koristiti)
### Primjer konstruktora
```java
    public Account(String name){
            this.name = name;
    }   
```

## Objekti i reference
- Ako se objekti deklariraju i ne dodijeli im se konkretna vrijednost (referenca) onda
poprimaju vrijednost `null`.
- Primitivni tipovi poprimaju vrijednost _0_ dok referentni poprimaju vrijednost `null`.

Ako napravimo nesto ovako objekti ce poceti dijeliti istu referencu. Odnosno promjenom
jedne varijable promijeniti ce se i druga.
```java
firstDate = secondDate;
```

Za usporedivanje objekata koristimo metodu `equals` koju je cesto potrebno nadjacati (_override_)
kako bi mogli usporedivati **custom** objekte.

## Scanner
- Ako se ne koristi import deklaracija za Scanner tip objekta onda se on moze inicijalizirati na ovaj nacin:
  ```java
    java.util.Scanner unos = new java.utilScanner(System.in);
  ```
## Referentni tipovi objekata
- Tipovi objekata koji su samo class version od standardnih tipova podataka kao sto su int,char,double itd.
- Treba napomenuti da su referenti tipovi klase te ako im se ne inicijalizira vrijednost da ce biti null, i daljnje
  operacije mogu baciti `NullPointerException`
- Primtivni tipovi se automatski inicijaliziraju na 0 odnosno `false`
