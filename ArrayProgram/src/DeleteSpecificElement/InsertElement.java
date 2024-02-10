package DeleteSpecificElement;
import java.util.Arrays;
public class InsertElement {
        // The main method where the program execution starts.
        public static int[] insertElement(int[] my_array, int Index_position,int newValue) {

            // Loop to shift elements to make space for the new element.
            for (int i = my_array.length - 1; i > Index_position; i--) {
                my_array[i] = my_array[i - 1];
            }

            // Insert the new element at the specified position.
            my_array[Index_position] = newValue;

            return my_array;
        }
    }
