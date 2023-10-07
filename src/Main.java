import java.util.ArrayList;
import java.util.Random;

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