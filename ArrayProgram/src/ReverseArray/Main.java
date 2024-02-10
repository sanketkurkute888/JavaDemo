package ReverseArray;

public class Main {
    public static void main(String[] args) {

        ReverseArray reverseArray=new ReverseArray();


                int[] array = {1, 2, 3, 4, 5}; // Example array

                // Printing original array
                System.out.println("Original Array:");
                for (int i : array) {
                    System.out.print(i + " ");
                }

                // Reversing the array
                reverseArray.reverseArray(array);

                // Printing reversed array
                System.out.println("\nReversed Array:");
                for (int i : array) {
                    System.out.print(i + " ");
                }
            }

}