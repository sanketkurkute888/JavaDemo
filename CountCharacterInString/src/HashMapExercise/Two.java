package HashMapExercise;
import java.util.HashMap;
import java.util.Map;

public class Two {

    public static void main(String[] args) {
        HashMap<Integer,String> hashMap=new HashMap<Integer,String>();
        hashMap.put(22,"Mango");
        hashMap.put(22,"Mango");
        hashMap.put(23,"Pineapple");
        hashMap.put(24,"Guava");
        hashMap.put(25,"Coconuts");
        hashMap.put(26,"Mango");
        System.out.println("Size of the hash map :"+hashMap.size());


//print the map elements
      for(Map.Entry x:hashMap.entrySet())
      {
          System.out.println(x.getKey()+" "+x.getValue());
      }
    }
}
