package SortElement;

public class SortArray {

        // Function to reverse the array
        public static int[] sortArray(int[] arr) {

            for (int i = 0; i < arr.length; i++) {
                for (int j = i+1; j < arr.length ; j++) {
                    if(arr[i]>arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }

            }

            return (arr);
        }

}
