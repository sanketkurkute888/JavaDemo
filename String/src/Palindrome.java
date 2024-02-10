public class Palindrome {
    public int isPalindrome(String str)
    {
        int flag=1;
        char[] arr = str.toCharArray();
        char[] arr1=str.toCharArray();
        int arrayLength = str.length();
        for (int i = 0; i < arrayLength / 2; i++) {
            char temp = arr[i];
            arr[i] = arr[arrayLength - i - 1];
            arr[arrayLength - i - 1] = temp;
        }

        for (int i = 0; i <arrayLength; i++) {
            if(arr[i]!=arr1[i])
            {
             flag=0;
            }
        }
        return flag;
    }
}
