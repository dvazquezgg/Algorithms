import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {

    public static int[] readInput(String dataFile) {
        int[] array = null;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(dataFile));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(",");
                System.out.print("Size: " + values.length + " ");
                array = new int[values.length];
                int count = 0;
                for (String value : values) {
                    System.out.print(value + " ");
                    array[count++] = Integer.parseInt(value);
                }
                System.out.println();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = readInput("numbers.csv");
        QuickSort.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}
