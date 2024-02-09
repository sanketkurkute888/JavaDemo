package DeleteSpecificElement;

import java.util.Arrays;

public class InsertElementMain {
    public static void main(String[] args) {

        // Declare and initialize an integer array 'my_array'.
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        // Define the position where the new element will be inserted.
        int Index_position = 2;

        // Define the value of the new element to be inserted.
        int newValue = 5;

        InsertElement insertElement = new InsertElement();
        insertElement.insertElement(my_array, Index_position, newValue);

//           Print the original array using Arrays.toString() method.
         System.out.println("After removing the second element: " + Arrays.toString(my_array));


    }


}
