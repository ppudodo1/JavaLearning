import java.io.File;
import java.util.ArrayList;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        File file = new File("secretMessage.txt");
        if(file.exists()){
                System.out.println("It's alive");
                System.out.println(file.getPath());
                System.out.println(file.getAbsolutePath());
                System.out.println(file.isFile());
        }
    }
}