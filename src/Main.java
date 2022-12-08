public class Main {
    public static void main(String[] args) {

        int SIZE = 100000;
        int[] array = Generator.generate(SIZE);

        long start = System.currentTimeMillis();
        BubbleSort.sort(array);
        long end = System.currentTimeMillis();

        if (SIZE <= 100){
            printArray(array);
        }
        System.out.println("BubbleSort: " + (end - start) + "ms");

        array = Generator.generate(SIZE);

        start = System.currentTimeMillis();
        SelectionSort.sort(array);
        end = System.currentTimeMillis();
        if (SIZE <= 100){
            printArray(array);
        }

        System.out.println("SelectionSort: " + (end - start) + "ms");

        array = Generator.generate(SIZE);

        start = System.currentTimeMillis();
        QuickSort.sort(array);
        end = System.currentTimeMillis();
        if (SIZE <= 100){
            printArray(array);
        }

        System.out.println("QuickSort: " + (end - start) + "ms");

        array = Generator.generate(SIZE);
        int value = array[SIZE / 2];

        if (SIZE <= 100){
            printArray(array);
        }

        start = System.currentTimeMillis();
        int index = SequentialSearch.search(array, value);
        end = System.currentTimeMillis();

        System.out.println("SequentialSearch: " + (end - start) + "ms");
        if(index != -1) {
            System.out.println("Found at index " + index);
        } else {
            System.out.println("Not found");
        }

        array = Generator.generate(SIZE);
        value = array[SIZE / 2];
        QuickSort.sort(array);

        if (SIZE <= 100){
            printArray(array);
        }

        start = System.currentTimeMillis();
        index = BinarySearch.search(array, value);
        end = System.currentTimeMillis();
        end = System.currentTimeMillis();

        System.out.println("BinarySearch: " + (end - start) + "ms");
        if(index != -1) {
            System.out.println("Found at index " + index);
        } else {
            System.out.println("Not found");
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}