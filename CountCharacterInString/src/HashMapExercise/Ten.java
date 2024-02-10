package HashMapExercise;

import java.util.HashMap;

public class Ten {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap=new HashMap<>();
        hashMap.put(1,"Red");
        hashMap.put(2,"Green");
        hashMap.put(3,"Black");
        hashMap.put(4,"White");
        hashMap.put(5,"Blue");

        String val=hashMap.get(3);
        System.out.println("Value for key 3 is "+val);


    }
}
