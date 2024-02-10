package TreeMap;

import java.util.TreeMap;

public class four {
    public static void main(String[] args) {
        TreeMap<String,String> treeMap=new TreeMap<String,String>();
        treeMap.put("C1","Red");
        treeMap.put("C2","Magenta");
        treeMap.put("C3","Black");
        treeMap.put("C4","Pink");
        treeMap.put("C5","Green");

        if(treeMap.containsValue("Red"))
        {
            System.out.println("The tree contains value Red");
        }
        else
        {
            System.out.println("The Three map does not contains the Red");
        }

        if(treeMap.containsKey("Silver"))
        {
            System.out.println("The tree contains value Silver");
        }
        else
        {
            System.out.println("The Three map does not contains the Silver");
        }

    }
}
