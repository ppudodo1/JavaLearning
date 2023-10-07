import java.util.ArrayList;
import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
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