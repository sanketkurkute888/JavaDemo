package TreeMap;

import java.util.Comparator;
import java.util.TreeMap;

public class Seven {
    public static void main(String[] args) {
        TreeMap<String, String> treeMap = new TreeMap<String, String>(new sortKey());
        treeMap.put("C1", "Red");
        treeMap.put("C4", "White");
        treeMap.put("C6", "Purple");
        treeMap.put("C2", "Green");
        treeMap.put("C3", "Black");
        treeMap.put("C5", "Magenta");


        System.out.println(treeMap);
    }
}
class  sortKey implements Comparator<String>
{
    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }
}

