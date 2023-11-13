# Genericko programiranje
Genericko programiranje nam omogucava da si skratimo muke i napisemo "opceniti" kod koji ce
raditi sa "opcenitim" tipovima objekata. Odnosno ne moramo definirati tipove objekata nad kojima
cemo vrsiti neke operacije.

Primjer genericke metode koja za parametar moze primiti objekt bilo kojeg tipa:
```java
public static <T> void printArray(T[] inputArray)
{
    for (T element : inputArray) {
        System.out.printf("%s ", element);
    }
    System.out.println();
}
```
Takoder mozemo napisati i metodu koja prima dva ulazna parametra istog tipa i vraca taj isti
tip podatka (`T`).
Primjer:
```java
public static <T> T maximum(T vrijednost1, T vrijednost2)
```
## Prevodenje generickih metoda
- Kada `compiler` prevodi genericku metodu u `bytecode`, sva pojavljivanja parametra `T` 
zamjenjuju se sa stvarnim tipom podatka
- Po _defaultu_ se `T` mijenja `Object` tipom
- Ako zelimo ograniciti metodu da prima samo odredene tipove objekta koji nasljduju samo
odredene tipove klasa to mozemo napraviti pomocu `extends` kljucne rijeci. Primjer:
```java
public static <T extends Student> void usporedi(T vr1, T vr2)
```
## Genericke klase
- Osim generickih **metoda** postoje i genericke klase. (Primjer jedne takve _emmbedane_ klase
je `ArrayList`)
- One omogucavaju definiranje tipova objekata prilikom instanciranja. Primjer:
```java
public class Stack<T>{
    private List<T> elements;
}
```
## Nedefinirani tipovi (`RAW TYPES`)
- U slucaju kad se koristi genericka klasa za instanciranje objekta a ne navedemo tip
podatka koja ce genericka klasa koristiti, implicitno se za taj tip koristi `Object`. Primjer:
```java
Stack doubleStack = new Stack(5);
//Pravilno bi bilo
Stack<double> st = new Stack<>(5);
```

## `Wildcards`
- Kada je potrebno napisati funkciju koja ce u argument primati genericki tip podatka, ali ne
bilo koji nego samo odredeni onda koristimo simbol `?`. Primjer:
```java
public static double sum(List<? extends Number> list){
    double total = 0;
    for (Number element : list) {
        total += element.doubleValue();
    }
    return total;
}
```
- Zamjenski simbol `?` oznacava **nepoznati tip** koji mora nasljedivati klasu `Number`
- Jedina mana koristenja zamjenskih simbola je ta sto nije moguce znati o kojem se tocno
tipu radi pa taj tip nije ni moguce koristiti unutar tijela metode

## U nastavku slijede primjeri vezani uz genericke klase

### Primjer metode koja vraca genericki tip podatka
```java
public static <T extends Comparable<T>> T maximum(T x, T y, T z)
{
    T max = x;
    if (y.compareTo(max) > 0)
    max = y;
    if (z.compareTo(max) > 0)
    max = z;
    return max;
}
```

### Primjer paramtetrizirane klase

```java
public class Stack<T>
{
    private List<T> elements;
    public Stack() {
        this(10);
    }
    public Stack(int capacity)
    {
        int initCapacity = capacity > 0 ? capacity : 10;
        elements = new ArrayList<T>(initCapacity);
    }
    public void push(T pushValue) {
        elements.add(pushValue);
    }
    public T pop()
    {
        if (elements.isEmpty()) {
            throw new EmptyStackException("Stack is empty, cannot pop");
        }
        return elements.remove(elements.size() - 1);
    }
}
```