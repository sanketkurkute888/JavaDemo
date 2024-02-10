package TreeMap;

import java.util.TreeMap;

public class Eleven {
    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap=new TreeMap<Integer,String>();
        treeMap.put(10,"Red");
        treeMap.put(30,"Green");
        treeMap.put(40,"Black");
        treeMap.put(50,"White");
        treeMap.put(60,"Magenta");

        System.out.println("Orignal TreeMap content :"+treeMap);
        System.out.println("Checking the entry of the 10");
        System.out.println("Value is "+treeMap.floorEntry(10));
        System.out.println("Checking the entry of the 30");
        System.out.println("Value is "+treeMap.floorEntry(30));

        System.out.println("Checking the entry of the 70");
        System.out.println("Value is "+treeMap.floorEntry(70));




    }
}
