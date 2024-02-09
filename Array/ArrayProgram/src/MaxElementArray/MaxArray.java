package MaxElementArray;

public class MaxArray {
    public static int maxElement(int[] array)
    {
        int maxElement = array[0]; // Assume first element as maximum
        for (int i = 1; i < array.length; i++)
        {
            if (array[i] > maxElement)
            {
                maxElement = array[i]; // Update maxElement if a larger element is found
            }
        }
        return (maxElement);
    }

}