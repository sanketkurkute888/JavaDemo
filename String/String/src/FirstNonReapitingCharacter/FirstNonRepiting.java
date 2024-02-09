package FirstNonReapitingCharacter;

public class FirstNonRepiting {
    public void FirstNonReapiting(String str)
    {
        char arr1[] = str.toCharArray();
        int arraylength = str.length();

        for (int i = 0; i < arraylength; i++) {
            boolean flag=true;
            for (int j = 0; j < arraylength; j++) {
                    if(i!=j &&arr1[i]==arr1[j]) {;
                        flag=false;
                        break;
                    }
            }
            if(flag) {
                System.out.println(arr1[i]);
                return;
            }
        }
    }



}
