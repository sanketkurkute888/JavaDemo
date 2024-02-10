package TreeMap;

import java.util.Set;
import java.util.TreeMap;
public class Five {
    private static TreeMap<String, String> treeMap;

    public Five() {
        this.treeMap=new TreeMap<>();
    }

    public static void main(String args[])
    {
        TreeMap<String,String> treeMap=new TreeMap<String,String>();
        treeMap.put("C1","Red");
        treeMap.put("C2","Green");
        treeMap.put("C3","Black");
        treeMap.put("C4","White");

        Set<String> keys=treeMap.keySet();
        for (String key:keys) {
            System.out.println(key);
        }

    }
}

