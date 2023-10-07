# ArrayLists
Array lists are basically just arrays that are used to store wrapper classes instead of primitive 
data types.

Let's look at one example of `ArrayList`:

```java
import java.util.ArrayList;

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

Just like we have regular 2d arrays we can also have 2d ArrayLists and they work on the same 
principle as regular 2d arrays. They are pretty similiar to 2d vectors in c++. They even have similiar methods. 

Here is one example:

```java
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();
        ArrayList<String> bakeryList = new ArrayList<>();
        bakeryList.add("Bread");
        bakeryList.add("Burek");
        bakeryList.add("Muffini");

        ArrayList<String> produceList = new ArrayList<>();
        produceList.add("Tomatoes");
        produceList.add("Peppers");
        produceList.add("Bananas");

        ArrayList<String> drinksList = new ArrayList<>();
        drinksList.add("Coca-cola");
        drinksList.add("Heineken");

        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinksList);
        System.out.println(groceryList);
    }
}
```
In the example above we passed `ArrayList` as value that should be stored in another
`ArrayList`.

This is the output of the code used above.

```java
//[[Bread, Burek, Muffini], [Tomatoes, Peppers, Bananas], [Coca-cola, Heineken]]
```