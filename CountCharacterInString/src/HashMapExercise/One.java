package HashMapExercise;

import java.util.HashMap;
import java.util.Map;

public class One {
    public static void main(String args[])
    {
        HashMap<Integer,String> hashMap=new HashMap<Integer,String>();
        hashMap.put(11,"Red");
        hashMap.put(12,"yellow");
        hashMap.put(13,"Pink");
        hashMap.put(14,"White");
        hashMap.put(15,"Green");

//        iterrate in the mam

        for(Map.Entry x:hashMap.entrySet())
        {
            System.out.println(x.getKey()+" "+x.getValue());
        }
    }
}
