package TreeMap;

import java.util.TreeMap;

public class Three {
    public static void main(String[] args) {
        TreeMap<String,String> treeMap1=new TreeMap<>();
        treeMap1.put("C1","sanket");
        treeMap1.put("C2","vaibhav");
        treeMap1.put("C3","ramakant");
        treeMap1.put("C4","digvijay");
        treeMap1.put("C5","ramesh");
        System.out.println(treeMap1);
        if(treeMap1.containsKey("C1"))
        {
            System.out.println("The tree map contains key C1");

        }
        else {
            System.out.println("The Tree map does not contains the key C1");
        }
        if(treeMap1.containsKey("C5"))
        {
            System.out.println("The tree map contains key C5");

        }
        else {
            System.out.println("The Tree map does not contains the key C5");
        }
    }
}
