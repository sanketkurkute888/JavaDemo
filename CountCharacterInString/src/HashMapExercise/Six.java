package HashMapExercise;

import java.util.HashMap;

public class Six {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap=new HashMap<>();
        hashMap.put(1,"sanket");
        hashMap.put(2,"Raju");
        hashMap.put(3,"Magesh");
        hashMap.put(4,"Suresh");
        hashMap.put(5,"Alpesh");
        hashMap.put(6,"Ganesh");

        System.out.println(hashMap);
        HashMap<Integer,String> newhashMap=new HashMap<Integer,String>();
        newhashMap= (HashMap<Integer, String>) hashMap.clone();
        System.out.println("cloned map"+newhashMap);
    }
}
