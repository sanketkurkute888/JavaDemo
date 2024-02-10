import javax.swing.text.html.HTMLDocument;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class MapSortByKey {
    public static void main(String[] args) {
        Map<String,String> languages=new HashMap<String,String>();
        languages.put("pos2","Marathi");
        languages.put("pos3","Hindi");
        languages.put("pos4","Tamil");
        languages.put("pos5","Telgu");

        System.out.println(languages);
        Map<String,String> SortedNumber=new TreeMap<>(languages);
        System.out.println(SortedNumber);


    }
}
