package TreeMap;
import java.util.TreeMap;

public class Eight {
    public static void main(String[] args) {
//        create the map
        TreeMap<String,String> treeMap=new TreeMap<String,String>();
        treeMap.put("C1","Red");
        treeMap.put("C2","Green");
        treeMap.put("C3","Black");
        treeMap.put("C4","White");
        treeMap.put("C5","Magenta");

        System.out.println("Orignal Treemap content"+treeMap);
        System.out.println("Frist key"+treeMap.firstEntry());
        System.out.println("Least key"+treeMap.lastEntry());

    }
}
