# Polymorphism
It is basically the same as in C++ just has a different syntax.

Let's take a look at an example:
```java
import java.util.ArrayList;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
            Car car = new Car();
            Bike bike = new Bike("Ime");
            Vehicle[] racers = {car,bike}; // because the two classes have the same parent class we can write this
            // This is polmorphism it is just morphing of objects so that they can identify like other classes
    }
}
```
We can also use something called _dynamic polymorphism_. We use it when we don't know which
type of object we want to use immediately so we assign it later.

Let's take a look at an example:

```java
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        Animal animal;
        int choice = Scanner.nextInt();
        if(choice==1){
                animal = new Dog();
                animal.speak();//bark
        }else if(choice==2){
            animal = new Cat();
            animal.speak();//meow
        }
    }
}
```