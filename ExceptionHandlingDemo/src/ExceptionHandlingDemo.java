public class ExceptionHandlingDemo {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6};
        System.out.println(arr[1]);
        try {
            System.out.println(arr[-1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        System.out.println(arr[3]);

    }
}
