package TreeMap;

import java.util.TreeMap;

public class Therteen {
    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap=new TreeMap<Integer,String>();
        treeMap.put(10,"Red");
        treeMap.put(30,"Green");
        treeMap.put(40,"Black");
        treeMap.put(50,"White");
        treeMap.put(60,"Magenta");

        System.out.println("Orginal TreeMap Content"+treeMap);
        System.out.println("Checking the entry for the 10");
        System.out.println("Key is "+(treeMap.headMap(10)));
        System.out.println("Checking the entry for the 30");
        System.out.println("Key is "+(treeMap.headMap(30)));
        System.out.println("Checking the entry for the 70");
        System.out.println("Key is "+(treeMap.floorKey(70)));



    }

}
