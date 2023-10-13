# Super Keyword
Super keyword is used as an replacement for `this` keyword when using 
inheritance. 

Let's take a look at an example:

`Main.java`
```java
import java.util.ArrayList;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
      Hero batman = new Hero("Bruce",46,"money");
        System.out.println(batman.toString());
    }
}
```
`Person.java`
```java
public class Person {
    String name;
    int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString(){
        return this.name + " " + this.age;
    }
}
```
`Hero.java`
```java
public class Hero extends Person{
    String superpower;
    public Hero(String name, int age, String superpower){
        super(name,age);
        this.superpower = superpower;
    }
    @Override
    public String toString(){
        return super.toString() + " "+this.superpower;
    }
}
```

The super class is just a parent class. When inheriting something from
parent class we use `super` instead of `this`.