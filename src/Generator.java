import java.util.Random;
public class Generator {

    public static int[] generate(int size) {
        // Create a new random number generator
        Random random = new Random();

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (random.nextInt(99999 - 100 + 1) + 100);
        }
        return array;
    }
}
