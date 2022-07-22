import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] myArray = new int[8];
        Random random = new Random();
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(20);
        }

        System.out.println(Arrays.toString(myArray));
        // arrays are stored as one contiguous block in memory
        // so, we had to decide the length when creating an array
        // arrays cannot be resized
        // every element occupies the same amount of space in memory

        // the objects are a reference, when you create an arrays of objects,
        // the array stores the object references, and object references are all same size
        // as a result the memory address of each element can be calculated
        // if the first one is at address x , the formulation is x + i*y to calculate ith element
        // to get the element requires only a simple calculation
        // that is the reason accessing an element in an array is O of 1, constant time complexity

        // unlike other data structure where other we store other information apart from the values
        // in array we only store the values
        // that means they are memory efficient

        // but searching an element in an array is different
        for (int value : myArray) {
            if (value == 7) {
                System.out.println("found a 7");
                break;
            }
        }
        // for the above code all the indexes needs to be searched
        // and, we need to think of the worst case scenario
        // this is linear time complexity
        // O of n


    }
}