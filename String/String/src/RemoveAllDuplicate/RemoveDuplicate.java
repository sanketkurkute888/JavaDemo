package RemoveAllDuplicate;

public class RemoveDuplicate {
    public static  String removeDuplicateChars(String sourceStr)
    {
        char[] arr1=sourceStr.toCharArray();

//        array to store string without duplicate element
        String targetStr="";
        for (int i = 0; i < arr1.length; i++) {
            if(targetStr.indexOf(arr1[i])==-1)
            {
                targetStr=targetStr+arr1[i];

            }
        }
        String str=new String(targetStr);
        return str;
    }
}
