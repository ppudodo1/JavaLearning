import java.util.ArrayList;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        int a = add(2,6);
        System.out.println(a);
        double b = add(2.2,3.3,4.4);
        System.out.println(b);
    }
    static int add (int x,int y){
        return x+y;
    }
    static  int add (int x, int y, int z){
        return x+y+z;
    }
    static double add (double x, double y){
        return x+y;
    }
    static double add (double x, double y, double z){
            return  x+y+z;
    }
}