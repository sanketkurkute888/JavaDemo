package StringAnagram;

public class StringAnagram {
    public int AnagramCheck(String str1, String str2) {
        str1 = str1.replaceAll(" ", "");
        str2 = str2.replaceAll(" ", "");
        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();
        int arraylength = str1.length();
        int arraylength2 = str2.length();

        if (arraylength == arraylength2) {
            for (int i = 0; i < arraylength; i++) {
                for (int j = i + 1; j < arraylength; j++) {
                    if (arr1[i] > arr1[j]) {
                        char temp = arr1[i];
                        arr1[i] = arr1[j];
                        arr1[j] = temp;
                    }
                }
            }
            System.out.println(arr1);
            for (int i = 0; i < arraylength2; i++) {
                for (int j = i + 1; j < arraylength2; j++) {

                    if (arr2[i] > arr2[j]) {
                        char temp = arr2[i];
                        arr2[i] = arr2[j];
                        arr2[j] = temp;
                    }
                }
            }
            System.out.println(arr2);

            String s1 = new String(arr1);
            String s2 = new String(arr2);
            if (s1.equals(s2)) {
                return 1;
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }
}

