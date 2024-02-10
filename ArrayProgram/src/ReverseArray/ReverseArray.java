package ReverseArray;

public class ReverseArray {

        // Function to reverse the array
        public static int[] reverseArray(int[] arr) {
            int start = 0;
            int end = arr.length - 1;

            while (start < end) {
                // Swapping elements at start and end indices
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

                // Move indices towards the center
                start++;
                end--;
            }
            return (arr);
        }

}
