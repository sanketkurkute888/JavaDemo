package SortElement;

import ReverseArray.ReverseArray;

public class Main {
    public static void main(String[] args) {

        SortArray sort=new SortArray();


                int[] array = {1, 2, 3, 8, 5}; // Example array

                // Printing original array
                System.out.println("Original Array:");
                for (int i : array) {
                    System.out.print(i + " ");
                }

                // Reversing the array
                sort.sortArray(array);

                // Printing reversed array
                System.out.println("\nSorted Array:");
                for (int i : array) {
                    System.out.print(i + " ");
                }
            }

}