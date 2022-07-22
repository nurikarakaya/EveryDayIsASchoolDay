import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // bubble sort is an in-place algorithm > no new arrays are created
        // O of n^2 time complexity: quadratic
        // degrades quickly


        int[] myArray = random_array(8, 50);
        System.out.println(Arrays.toString(myArray));

        int unsortedIndex = myArray.length - 1;
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < unsortedIndex; j++) {
                if (myArray[j] > myArray[j + 1]) {
                    swap(myArray, j, j + 1);
                }

            }
            unsortedIndex -= 1;

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