# Constructors
Constructor are the same as in c++ (the syntax is a little bit different). They are special
methods that are called when object is created. They are used to assign variables to the current
object by using `this` keyword. Let's look at an example of a `constructor`:

`Human.java`
```java
    public class Human {
    String name;
    int age;
    public Human(String name, int age){
        this.name = name;
        this.age = age;
    }
    void eat(){
        System.out.println("You ate");
    }
}
```
In the constructor above we are using `this` keyword to assign variable values to the current
object that is being created.

`Main.java`
```java
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Human me = new Human("Dodo",19);
        System.out.println(me.name);
        System.out.println(me.age);
        me.eat();
    }

}
```

## Overloading constructors
We can also overload `constructors` just like the `methods` if we want the same objects with
different parameters. Here's one example of overloading `constructors`:


`Human.java`
```java
    public class Human {
    String name;
    int age;
    int weight;
    public Human(){

    }
    public Human(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Human(String name, int age, int weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    void eat(){
        System.out.println("You ate");
    }
}
```
`Main.java`

```java
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Human me = new Human("Dodo",19,85);
        Human gf =  new Human("SIPA",19);
        Human brother =  new Human();
        System.out.println(me.name);
        System.out.println(me.age);
        me.eat();
    }
}
```

In the example above we can see that we created `objects` from the same `class` but each
object has different parameters and values because of the overloaded `constructor`.