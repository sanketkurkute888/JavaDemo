package MinEmlementArray;

public class MinElement {
    public static int minElement(int[] array)
    {
        int minElement = array[0]; // Assume first element as maximum
        for (int i = 1; i < array.length; i++)
        {
            if (array[i] < minElement)
            {
                minElement = array[i]; // Update maxElement if a larger element is found
            }
        }
        return (minElement);
    }
}
