public class SequentialSearch {
    public static int search(int[] array, int target) {
        // Loop through the array, starting at the first element
        for (int i = 0; i < array.length; i++) {
            // If the current element is the target, return its index
            if (array[i] == target) {
                return i;
            }
        }

        // If the target was not found in the array, return -1
        return -1;
    }
}