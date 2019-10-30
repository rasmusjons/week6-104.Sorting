
public class Main {

    public static void main(String[] args) {
        // write testcode here

        // indexes:   0  1  2  3  4
        int[] values = {6, 5, 8, 7, 11};
        System.out.println("Index of the smallest: " + indexOfTheSmallest(values));

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
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (smallestNumber == array[i]) {
                index = i;
            }

        }
        return index;
    }

}
