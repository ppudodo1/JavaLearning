# Dodatno

## Primjer rada sa iznimkom
```java
boolean nastaviPetlju = false;
    do {
        try {
            System.out.print("Unesite dva broja: ");
            int prvi = unos.nextInt();
            int drugi = unos.nextInt();
            int rezultat = podijeli(prvi, drugi);
            System.out.println("Rezultat dijeljenja je: " + rezultat);
            nastaviPetlju = false;
        }
        catch(InputMismatchException ex1) {
            System.out.println("Morate unijeti brojčane vrijednosti.");
            unos.nextLine();
            nastaviPetlju = true;
        }
        catch(ArithmeticException ex2) {
            System.out.println("Unesite ispravne vrijednosti za dijeljenje.");
            unos.nextLine();
            nastaviPetlju = true;
    }
} while(nastaviPetlju)

```

## Primjeri metoda sa iznimkama:

```java
public class Main {
    public static void main(String[] args)  {


        try{
            metodaKojaBacaNeoznacenuIznimku();
        }catch (Neoznacena e){
            System.out.println(e.getMessage());
        }
    }
    public static void metodaKojaBacaNeoznacenuIznimku() throws Neoznacena{ // Kako se radi o neoznacenoj iznimci ona moze i ne mora imati
        // throws deklaraciju kod tijela metode.
       // throw new Neoznacena("Neoznacena");
        try{
            System.out.println("Nesto");
        }catch (Neoznacena e){ // ne baca nikakav error kod neoznacene iznimke

        }
    }
    public static void metodaKojaBacaOznacenuIznimku() throws Oznacena { // Kako se radi o oznacenoj iznimci ona mora imat
        // throws deklaraciju kod tijela metode
        throw new Oznacena("b");
        try{
            System.out.println("Nesto");
        }catch (Oznacena e){ // baca error kod oznacene iznimke

        }
    }
}
```