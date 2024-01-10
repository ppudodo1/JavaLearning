import java.security.SecureRandom;
import java.util.Arrays;

public class SimpleArray {
    private static final SecureRandom generator = new SecureRandom();
    private final int[] array; // podjeljenji array
    private int writeIndex = 0; // djeljenji index elementa koji treba upisati
    public SimpleArray(int size){
        array = new int[size];
    }
    public synchronized String toString(){
        return Arrays.toString(array);
    }
    public synchronized void add (int value){
        int position = writeIndex;
        try{
            // stavljamo nit na spavanje izmedu 0 do 0.5 sek => ovo je random
            Thread.sleep(generator.nextInt(500));
        }catch (InterruptedException e){
            Thread.currentThread().interrupt(); // ponovo prekidamo thread
        }
        array[position] = value;
        System.out.printf("%s wrote %2d to element %d.%n",
                Thread.currentThread().getName(), value, position);
        ++writeIndex; // increment index of element to be written next
        System.out.printf("Next write index: %d%n", writeIndex);
    }
}
