package HashMapExercise;

import java.util.HashMap;

public class Five {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap=new HashMap<>();

        hashMap.put(1,"Sanket");
        hashMap.put(2,"Vijay");
        hashMap.put(3,"Mangesh");
        hashMap.put(4,"Ganesh");
        hashMap.put(5,"Reshma");


        boolean isEmpty= hashMap.isEmpty();
        System.out.println(isEmpty);

        hashMap.clear();
         isEmpty= hashMap.isEmpty();
        System.out.println(isEmpty);
    }
}
