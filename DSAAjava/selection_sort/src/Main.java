import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // selection sort: in-place algorithm, O of n^2 (quadratic)
        // less swap than bubble sort, so generally performs better
        // however, unstable sort algorithm


        System.out.println("my implementation");
        int[] myArray = randomArray(10, 100);
        System.out.println(Arrays.toString(myArray));
        mySelectionSort(myArray);

        System.out.println("lecture implementation");
        int[] myArray1 = randomArray(10, 100);
        System.out.println(Arrays.toString(myArray1));
        lectureImplementation(myArray1);


    }

    public static void mySelectionSort(int[] myArray) {
        int lastSortedIndex = myArray.length;
        for (int i = 0; i < myArray.length; i++) {
            int highestValue = myArray[0];
            int highestValueIndex = 0;
            // start j from 1, because we already declared 0 as the largest
            // no need to compare 0 with 0
            for (int j = 1; j < lastSortedIndex; j++) {
                if (myArray[j] > highestValue) {
                    highestValue = myArray[j];
                    highestValueIndex = j;
                }

            }
            swap(myArray, lastSortedIndex - 1, highestValueIndex);
            lastSortedIndex -= 1;
            System.out.println(Arrays.toString(myArray));
        }

    }

    public static void lectureImplementation(int[] myArray) {
        // last unsorted index starts at the last index
        // the array will be sorted from right to left
        for (int lastUnsortedIndex = myArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largest = 0;
            // no need to go beyond the last sorted index so j < lastUnsortedIndex
            for (int j = 1; j <= lastUnsortedIndex; j++) {
                if (myArray[j] > myArray[largest]) {
                    largest = j;
                }

            }
            swap(myArray, largest, lastUnsortedIndex);
            System.out.println(Arrays.toString(myArray));

        }

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

    public static int[] randomArray(int arrLength, int upperRange) {
        /* returns an array of length arrLength with the range upperRange */
        int[] myArray = new int[arrLength];
        Random random = new Random();
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(upperRange);
        }
        return myArray;
    }
}