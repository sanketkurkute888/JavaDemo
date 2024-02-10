package HashMapExercise;

import java.util.HashMap;

public class Twelve {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap=new HashMap<Integer,String>();
        hashMap.put(1,"Red");
        hashMap.put(2,"Green");
        hashMap.put(3,"Black");
        hashMap.put(4,"White");
        hashMap.put(5,"Blue");
        System.out.println("Collection viev is:"+hashMap.values());
    }
}
