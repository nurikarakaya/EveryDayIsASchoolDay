import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // selection sort: in-place algorithm, O of n^2 (quadratic)
        // less swap than bubble sort, so generally performs better
        // however, unstable sort algorithm

        int[] myArray = random_array(10, 100);
        System.out.println(Arrays.toString(myArray));

        int lastSortedIndex = myArray.length;
        for (int i = 0; i < myArray.length; i++) {
            int highestValue = myArray[0];
            int highestValueIndex = 0;
            for (int j = 0; j < lastSortedIndex; j++) {
                if (myArray[j] > highestValue) {
                    highestValue = myArray[j];
                    highestValueIndex = j;
                }

            }
            swap(myArray, lastSortedIndex - 1, highestValueIndex);
            lastSortedIndex -= 1;
            System.out.println(Arrays.toString(myArray));
        }
        System.out.println(Arrays.toString(myArray));
    }


    public static void swap(int[] array, int i, int j) {
        /* swaps the values of indices i and j */
        if (i == j) {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static int[] random_array(int arr_length, int upper_range) {
        /* returns an array of length arr_length with the range upper_range */
        int[] myArray = new int[arr_length];
        Random random = new Random();
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(upper_range);
        }
        return myArray;
    }
}