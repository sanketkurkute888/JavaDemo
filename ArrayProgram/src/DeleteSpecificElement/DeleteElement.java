package DeleteSpecificElement;

// Import the Arrays class from the java.util package.

// Define a class named Exercise7.
public class DeleteElement {

    // Remove element

    public static int[] removeArrayElement(int[] my_array, int removeIndex) {

        // Loop to remove the lement at the specified index.
        for (int i = removeIndex; i < my_array.length - 1; i++) {
            my_array[i] = my_array[i + 1];
        }
        return my_array;
    }

    //       insert element
    public static int[] insertElement(int[] my_array, int Index_position, int newValue) {

        // Loop to shift elements to make space for the new element.
        for (int i = my_array.length - 1; i > Index_position; i--) {
            my_array[i] = my_array[i - 1];
        }

        // Insert the new element at the specified position.
        my_array[Index_position] = newValue;

        return my_array;
    }

}