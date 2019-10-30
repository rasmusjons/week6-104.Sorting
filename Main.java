
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
        System.out.println(Arrays.toString(values));
        
    }

    public static int smallest(int[] array) {
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {

            if (smallest > array[i]) {
                smallest = array[i];
            }

        }
        return smallest;

    }

    public static int indexOfTheSmallest(int[] array) {
        // code goes here

        int smallestNumber = smallest(array);
        int indexSmallest = 0;

        for (int i = 0; i < array.length; i++) {
            if (smallestNumber == array[i]) {
                indexSmallest = i;
            }

        }
        return indexSmallest;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {

        int indexSmallest = 99;
        int smallest = Integer.MAX_VALUE;

        for (int i = (0 + index); i < array.length; i++) {
            if (smallest > array[i]) {              // återanvänder koden från smallest()
                smallest = array[i];                // 
            }
            if (smallest == array[i]) {
                indexSmallest = i;
            }

        }
        return indexSmallest;
    }

    public static void swap(int[] array, int index1, int index2) {

        int valueOne = array[index1];
        int valueTwo = array[index2];

        array[index1] = valueTwo;
        array[index2] = valueOne;

    }

    public static void sort(int[] array) {
                
        for (int i = 0; i < array.length; i++){
            int smallest = indexOfTheSmallestStartingFrom(array,i);
        swap(array, i, smallest);
        }
        

    }

}
