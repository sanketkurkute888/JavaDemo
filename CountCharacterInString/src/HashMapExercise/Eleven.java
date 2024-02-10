package HashMapExercise;

import java.util.HashMap;
import java.util.*;

public class Eleven {

    private static Collection<String> valueset;

    public static void main(String[] args) {
        HashMap<Integer,String> hashMap=new HashMap<>();
        hashMap.put(1,"Red");
        hashMap.put(2,"Green");
        hashMap.put(3,"Black");
        hashMap.put(4,"White");
        hashMap.put(5,"Blue");

        Set keyset=hashMap.keySet();

        System.out.println("Key set values are "+keyset);

        for(Map.Entry x:hashMap.entrySet())
        {
            System.out.println(x.getValue());
        }
    }
}
