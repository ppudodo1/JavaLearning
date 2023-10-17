# Interface
You can think of interface as a tempplate that can be applied to a class. It is similiar to
inheritance, but specifies what a class has/must do. Classes can apply more than one interface
while inheritance is only limited to one `super`.

Let's take a look at an example:

`Main.java`
```java
import java.util.ArrayList;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
            Rabbit rab = new Rabbit();
            rab.flee();
            Fish fish = new Fish();
            fish.flee();
            fish.hunt();
    }
}
```
`Prey.java`
```java
public interface Prey {
    void flee(); // interfaces work like abastract classes and can contain abstract methods
}
```
`Predator.java`
```java
public interface Predator {
    void hunt();

}
```
`Rabbit.java`
```java
public class Rabbit implements Prey{
    @Override
    public void flee() {
        System.out.println("The rabbit is fleeing");
    }
}

```
`Fish.java`
```java
public class Fish implements Prey,Predator{
    @Override
    public void flee() {
        System.out.println("The fish is fleeing");
    }

    @Override
    public void hunt() {
        System.out.println("The fish is hunting");
    }
    //In this case we have two interfaces in a class and can access both of it's methods because of this
}
```

This example above is pretty self-explanitory