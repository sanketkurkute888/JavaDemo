package TreeMap;

import java.util.TreeMap;

public class Two {
    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap=new TreeMap<>();
        TreeMap<Integer,String> treeMap1=new TreeMap<>();
        treeMap.put(1,"sanket");
        treeMap.put(2,"vaibhav");
        treeMap.put(3,"ramakant");
        treeMap.put(4,"digvijay");
        treeMap.put(5,"ramesh");

        treeMap1.put(6,"shyam");
        treeMap1.put(7,"ram");
        treeMap1.put(8,"sayli");
        treeMap.putAll(treeMap1);
        System.out.println("After copying the map1 into map"+treeMap);
    }
}
