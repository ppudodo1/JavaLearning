# Inheritance
Inheritance in `java` works similarly to inheritance in `c++`. We have two classes one is a 
_parent_ class and the other is _child_ class. _Child_ class inherits _methods_ and attributes from
_parent_ class. Let's take a look at an example.

`Vehicle.java`=>parent class:

```java
public class Vehicle {
    void go(){
        System.out.println("This vehicle is moving");
    }
    void stop(){
        System.out.println("This vehicle stopped");
    }
}
```
`Bike.java`=>child class:
```java
public class Bike extends Vehicle {
    String name;
    public Bike(String name){
        this.name = name;
    }
}
```
`Main.java`
```java
import java.util.ArrayList;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Bike bike1 = new Bike("BMX");
        bike1.go();
    }
}
```
In this example `Bike` class inherits methods `go` and `stop` from `Vehicle` class, in other
words `Bike` objects gain ability to use `Vehicle` methods and variables.