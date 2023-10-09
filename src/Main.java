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