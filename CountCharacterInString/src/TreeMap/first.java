package TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class first {
    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap=new TreeMap<>();
        treeMap.put(1,"sanket");
        treeMap.put(2,"vaibhav");
        treeMap.put(3,"ramakant");
        treeMap.put(4,"digvijay");
        treeMap.put(5,"ramesh");

        for(Map.Entry<Integer,String> x:treeMap.entrySet())
        {
            System.out.println(x.getKey()+"=>"+x.getValue());
        }
    }
}
