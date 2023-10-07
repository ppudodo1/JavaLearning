# ArrayLists
Array lists are basically just arrays that are used to store wrapper classes instead of primitive 
data types.

Let's look at one example of `ArrayList`:

```java
import java.util.ArrayList;
    

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList<String> food =  new ArrayList<String>();
        food.add("Pizza");
        food.add("Kebab");
        food.add("Cevpi");
        food.add("Hamburger");
        for(int  i = 0;i<food.size();i++){
            System.out.println(food.get(i));
        }

    }
}


```

By using wrapper classes we have access to methodes such as `set` and `get`. 

For example we can do this to _set_, _remove_ and _get_ elements from `ArrayList`:


```java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> food =  new ArrayList<String>();
        food.add("Pizza");
        food.add("Kebab");
        food.add("Cevpi");
        food.add("Hamburger");
        
        food.set(0,"sushi"); // this will set 1st element of an array to sushi
        food.remove(2); //this will remove 3rd element from an array
        //food.clear();  can clear array
        for(int  i = 0;i<food.size();i++){
            System.out.println(food.get(i));
        }
    }
}

```