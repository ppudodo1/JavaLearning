# Dodatne stvari za kolokvij

## Modifikatori pristupa
- public => omogucava pristup iz svih klasa. Pristup: unutar klase, iz klase i podklase u istom paketu i iz klase i podklase u razlicitom paketu
- protected => omogucava pristup iz svih podklasa. Pristup:
unutar klase, iz klase i podklase u istom paketu i podklase u razlicitom paketu.
- package-private => ovo se implicitno poziva kada ne dodas modifikator. Kljucna stvar je da programer ne moze pozvati ovo. Pristup iz klasa u istom paketu.
- private pristup samo iz klase


## Metode Object klase

Primjer:

```java
public class PrimjerKlase extends Object {

    private int broj;
    private String ime;
    // Konstruktor
    public PrimjerKlase(int broj, String ime) {
        this.broj = broj;
        this.ime = ime;
    }
    // equals metoda
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;  // Ako su reference iste, objekti su jednaki
        if (obj == null || getClass() != obj.getClass()) return false;  // Ako objekt nije iste klase, nisu jednaki
        PrimjerKlase that = (PrimjerKlase) obj;
        // Usporedba po atributima
        return broj == that.broj && ime.equals(that.ime);
    }
    // hashCode metoda
    @Override
    public int hashCode() {
        // Custom izračun hashCode-a na temelju atributa objekta
        return 31 * broj + ime.hashCode();
    }
    // toString metoda
    @Override
    public String toString() {
        // Prikaz objekta u obliku Stringa
        return "PrimjerKlase{broj=" + broj + ", ime='" + ime + '\'' + '}';
    }
    // clone metoda
    @Override
    protected Object clone() throws CloneNotSupportedException {
        // Deep copy - stvaranje nove instance i kopiranje atributa
        PrimjerKlase clone = (PrimjerKlase) super.clone();
        // Ako postoje objekti unutar klase, potrebno ih je također klonirati
        // Ovdje je primjer s atributom koji je tipa String pa nije potrebno dodatno klonirati
        return clone;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        PrimjerKlase obj1 = new PrimjerKlase(42, "Primjer");
        PrimjerKlase obj2 = new PrimjerKlase(42, "Primjer");
        // Primjer poziva metode equals
        System.out.println("Metoda equals: " + obj1.equals(obj2));
        // Primjer poziva metode hashCode
        System.out.println("HashCode obj1: " + obj1.hashCode());
        System.out.println("HashCode obj2: " + obj2.hashCode());

        // Primjer poziva metode toString
        System.out.println("ToString obj1: " + obj1.toString());

        // Primjer poziva metode clone
        PrimjerKlase cloneObj = (PrimjerKlase) obj1.clone();
        System.out.println("Clone obj1: " + cloneObj.toString());
    }
}
```

## Polimorfizam
Primjer:
```java
abstract class Animal{
    public abstract void glasanje();
}
class Dog extends Animal{

    @Override
    public void glasanje() {
        System.out.println("Vau vau");
    }
}
class Cat extends Animal{
    @Override
    public void glasanje() {
        System.out.println("Meow, meow");
    }
}
public class Main {
    public static void main(String[] args)  {
        Animal[] arr = new Animal[2];
        Animal pas = new Dog();
        Animal macka = new Cat();
        arr[0]=pas;
        arr[1] = macka;
        for(int i = 0;i<arr.length;i++){
            arr[i].glasanje();
        }
    }
}

```

## Sucelja
- Varijable u suceljima su automatski oznacene modifikatorom `public` prema Radovanovom iako su oznacene i sa modifikatorom
`static`. Za te varijable ne smiju se koristi nikoji drugi modifikatori inace kompajler javlja gresku. Metode su automatski oznacene modifikatorom `public`. `static` i `default` metode MORAJU imati tijelo inace kompajler javlja gresku.

Primjer:

```java
package org.example;

public interface NekoSucelje {
     public static int test = 69;
    private void test() {
        System.out.println("Test");
    }
    public static void test2() {
        System.out.println("Test 2");
    }
    public default void test3() {
        test();
    }
}
```

## Zapisi
- Varijable u zapisima moraju biti oznacene modifikator static inace kompajler javlja gresku.

```java
package org.example;

public record Dracevac(String ime) {
        public static int A;
        

        public static  void a(){

        }
        public void b(){

        }
        private void c(){

        }

}
```

## Sortiranje elemenata u polju pomocu lambda funkcija:

```java
String[] prezimena = new String[5];
prezimena[0] = "Ivanić";
prezimena[1] = "Žarnić";
prezimena[2] = "Anić";
prezimena[3] = "Perić";
prezimena[4] = "Horvat";
Arrays.sort(prezimena, (p1, p2) -> p1.compareTo(p2));
System.out.println(Arrays.toString(prezimena));

```

