package HashMapExercise;

import java.util.HashMap;
import java.util.Map;

public class Three {
    public static void main(String[] args) {
//        copying the one hash map elements into another hash map
        HashMap<Integer,String> hashMap=new HashMap<>();
        HashMap<Integer,String> hashMap1=new HashMap<>();
        hashMap1.put(11,"magenta");
        hashMap1.put(12,"Green");
        hashMap1.put(13,"Black");

        hashMap.put(14,"yellow");
        hashMap.put(15,"Red");
        hashMap.put(16,"Blue");
        hashMap.put(17,"Pink");

        System.out.println("First map");
        for(Map.Entry x:hashMap1.entrySet())
        {
            System.out.println(x.getKey()+" "+x.getValue());
        }

        System.out.println("Second map");
        for(Map.Entry x:hashMap.entrySet())
        {
            System.out.println(x.getKey()+" "+x.getValue());
        }

        hashMap1.putAll(hashMap);
        System.out.println("After the adding all the map elements into map");
        System.out.println("First map");
        for(Map.Entry x:hashMap1.entrySet())
        {
            System.out.println(x.getKey()+" "+x.getValue());
        }
    }
}
