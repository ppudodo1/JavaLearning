# Objects

Objects are instances of classes that contain certain attributes and methods. We can think of
objects as new data types. You can create classes (which are just blueprint for objects) in the
same files, for example you can create them in `Main.java` file. Or you can create them in 
separate file under the same directory which is considered to be a lot cleaner and more 
readable.

Here is one example of a `class`
```java
    public class Car {
    String make = "Chevorlette";
    String model = "Corvette";
    int year = 1972;
    String color = "black";
    double price = 50000.00;
    void drive (){
        System.out.println("You drive the car");
    }
    void brake(){
        System.out.println("You stepped on the breaks");
    }
}
```
Here is an example of creating a _car_ object in `Main` class:
```java
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println(car1.make);
        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println(car1.color);
        System.out.println(car1.price);
        car1.drive();
        car1.brake();
    }
}
```
Here we are printing and calling object's _attributes_ and _methods_ by using the `dot (.)`
operator.

We can also create an array of `objects` like with regular data types here is an example:

`Food.java`
```java
public class Food {
    String name;
    public Food(String name){
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
           Food food1 = new Food("chicken");
           Food food2 = new Food("pizza");
           Food food3 = new Food("kebab");

           Food[] fridge = {food1,food2, food3};
           System.out.println(fridge[0].name);
    }
}
```
