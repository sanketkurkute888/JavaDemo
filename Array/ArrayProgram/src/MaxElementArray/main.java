package MaxElementArray;



public class main {
    public static void main(String[] args) {

        MaxArray max=new MaxArray();


        int[] array = {1, 2, 3, 4, 5,12345,23423}; // Example array

        // Printing original array
        System.out.println("Original Array:");
        for (int i : array) {
            System.out.print(i + " ");
        }

        // Reversing the array
                System.out.println("\n"+"max element form the array:"+max.maxElement(array));

        // Printing reversed array

    }

}
