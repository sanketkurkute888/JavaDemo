public class ReverseString {
    public void revString(String str) {
        char[] arr = str.toCharArray();
        int arraylength = str.length();
        for (int i = 0; i <arraylength / 2; i++) {
            char temp = arr[i];
            arr[i] = arr[arraylength - i - 1];
            arr[arraylength - i - 1] = temp;
        }
        String reverseString = new String(arr);
        System.out.println(reverseString);
    }

}
