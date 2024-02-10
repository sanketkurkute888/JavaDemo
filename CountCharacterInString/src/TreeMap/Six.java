package TreeMap;

import java.util.TreeMap;

public class Six {
    public static void main(String[] args) {
        TreeMap<String,String> treeMap=new TreeMap<String,String>();
        treeMap.put("C1","Red");
        treeMap.put("C2","Green");
        treeMap.put("C3","Black");
        treeMap.put("C4","White");

        System.out.println(treeMap);
        treeMap.clear();
        System.out.println("The new Map"+treeMap);

    }
}
