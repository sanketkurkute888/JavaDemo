package DeleteSpecificElement;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        DeleteElement obj = new DeleteElement();
        // Declare and initialize an integer array 'my_array'.
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        // Print the original array using Arrays.toString() method.
        System.out.println("Original Array : " + Arrays.toString(my_array));

        // Define the index of the element to be removed (second element, index 1, value 14).
        int removeIndex = 2;


        //calling
        obj.removeArrayElement(my_array, removeIndex);


        // Print the modified array after removing the second element.
        System.out.println("After removing the second element: " + Arrays.toString(my_array));



    }
}

