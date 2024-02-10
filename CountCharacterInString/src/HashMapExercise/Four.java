package HashMapExercise;

import java.util.HashMap;
import java.util.Map;
public class Four {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap=new  HashMap<Integer,String>();
        hashMap.put(1,"Dog");
        hashMap.put(2,"Cat");
        hashMap.put(3,"Rat");
        hashMap.put(4,"Pig");
        hashMap.put(5,"Bullock");

//        print
        for(Map.Entry x:hashMap.entrySet())
        {
            System.out.println(x.getKey()+" "+x.getValue());
        }
//   remove all the elements form the hash map
          hashMap.remove(3);
          hashMap.clear();
//after removing all Elements
//        for(Map.Entry x:hashMap.entrySet())
//        {
//            System.out.println(x.getKey()+" "+x.getValue());
//        }

        System.out.println(hashMap);
    }
}
