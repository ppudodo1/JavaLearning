# Dodatno o lambdama

## Funkcionalno sucelje

```java
 // Predicate sucelje nam sluzi da bi provjerili neki uvjet jer ono predstavlja kao nekakav boolean
        List<String> names = Arrays.asList("John", "Alice", "Bob", "Charlie");
        Predicate<String> vece = name-> name.length() >5;
        names.stream()
                .filter(vece) // filter prima Predicate sucelje kao argument
                .forEach(System.out::println);
        // Consumer sucelje nam sluzi uglavnom za ispisivanje nekih elemenata. Prima genericki tip elementa a ne vraca nista
        Consumer<String> ispis = name->System.out.println(name.toUpperCase());
        // Function sucelje nam sluzi da provedemo neke operacije nad elementima. Prima element tipa T i vraca element tipa R
        Function<String, Integer> strLengthFunction = s -> s.length(); // ovdje primamo String a vracamo Integer
        String inputString = "Hello, World!";
        int length = strLengthFunction.apply(inputString); // apply metoda prima tip parametra koji proslijedujemo sucelju
        // UnaryOperator je specijalizirani oblik Function sucelja prima i vraca isti tip podatka
        UnaryOperator<Integer> dob = integer -> integer*integer;
        Integer a = 5;
        Integer doubleA = dob.apply(a);
        // BinaryOperator je slicno kao Unary samo sto koristi dva argumenta
        BinaryOperator<Integer> zbroj = (x,y)->x+y;
        Integer rijes = zbroj.apply(3,4);
```