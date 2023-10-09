# Static keyword

Static is a keyword that enables objects to share a one copy of a variable or method. 
The class "owns" static member. Let's look at some examples:

`Friend.java`
```java
public class Friend {
    String name;
    static int  numberOfFriends;
    public Friend(String name){
        this.name = name;
        numberOfFriends++;
    }
}
```
`Main.java`
```java
import java.util.ArrayList;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Friend friend1 = new Friend("Luka");
        Friend friend2 = new Friend("Grgo");
        Friend friend3 = new Friend("Luka");
         System.out.println(Friend.numberOfFriends);
    }
}
```
In the example above inside `Main` class we are accessing `numberOfFriends` in a static way.