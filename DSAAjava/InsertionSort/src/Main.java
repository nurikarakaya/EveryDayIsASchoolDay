import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // in-place algorithm
        // O of n^2, quadratic time complexity
        // stable algorithm


        int[] myArray = randomArray(10, 51);
        System.out.println(Arrays.toString(myArray));
        myInsertionSort(myArray);

        System.out.println("========================");

        int[] myArray1 = randomArray(10, 51);
        System.out.println(Arrays.toString(myArray1));
        lectureImplementation(myArray1);


    }

    public static void myInsertionSort(int[] myArray) {
        int unsortedIndex = 1;
        for (int i = 1; i < myArray.length; i++) {
            int sortedIndex = unsortedIndex - 1;
            for (int j = sortedIndex; j >= 0; j--) {
                if (myArray[j + 1] < myArray[j]) {
                    swap(myArray, (j + 1), j);
                }
            }
            unsortedIndex += 1;
            System.out.println(Arrays.toString(myArray));
        }

    }

    public static void lectureImplementation(int[] myArray) {

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < myArray.length; firstUnsortedIndex++) {
            int elementToSort = myArray[firstUnsortedIndex];
            // save the element to be sorted, because it will be overwritten
            int i; // declared outside the loop, because it will be used after the loop

            for (i = firstUnsortedIndex; i > 0 && myArray[i - 1] > elementToSort; i--) {

                myArray[i] = myArray[i - 1];
                // shifting elements to the right to create space for the lower value element
                // 20,35,-15 ; -15 is the element to sort. 35 shifted to the right so -15 overwritten.
                // that is the reason we save element sorted in the first line
                // ==> 20,35,35 ; 20 shifted to the right, 35 on the left overwritten ==> 20,20,35


            }
            myArray[i] = elementToSort;
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