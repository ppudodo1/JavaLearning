# Abstraction
We use abstraction when we want to add a layer of security in our code.
For example _classes_ can be abstract or even _methods_. Abstraction means
that we cannot create object of that class we can only create a `child` object
of that `class`.

Let's take a look at an example:
`Main.java`
```java
import java.util.ArrayList;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
      Hero batman = new Hero("money");
        System.out.println(batman.toString());
        batman.speak();
    }
}
```
`Person.java`
```java
public abstract class Person {
    abstract void speak();
}
```
This class is abstract and we cannot create objects or call `speak` method
from it.
`Hero.java`
```java
public  class Hero extends Person{
    String superpower;
    public Hero(String superpower){
        this.superpower = superpower;
    }
    @Override
    public String toString(){
        return this.superpower;
    }

    @Override
    void speak() {
        System.out.println("Hi");
    }
}
```
This class inherits a `Person` class meaning we HAVE TO override 
`speak` method. Naturally we can create _objects_ from this class as it 
is not _abstract_