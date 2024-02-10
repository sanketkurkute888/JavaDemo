import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortMapByPersonLastName {
    // Implementation of HashMap
    Map<String, Person> map = new HashMap<String, Person>();

    public static void main(String[] args) {
        SortMapByPersonLastName sv = new SortMapByPersonLastName();
        sv.createMap();
        System.out.println("Sorting values by person's last name in ascending order:");
        sv.sortByPersonLastName(true);
        System.out.println("Sorting values by person's last name in descending order:");
        sv.sortByPersonLastName(false);
    }

    // Method to add Person objects as values in the HashMap
    void createMap() {
        map.put("John", new Person("John", "Doe", 30));
        map.put("Jane", new Person("Jane", "Smith", 25));
        map.put("Mike", new Person("Mike", "Johnson", 35));
        map.put("Anna", new Person("Anna", "Williams", 28));
        map.put("David", new Person("David", "Brown", 40));

        System.out.println("Before sorting: ");
        printMap(map);
    }

    // Sort elements by person's last name
    void sortByPersonLastName(boolean order) {

        // Convert HashMap into List
        List<Entry<String, Person>> list = new LinkedList<Entry<String, Person>>(map.entrySet());

        // Sorting the list elements based on person's last name
        Collections.sort(list, new Comparator<Entry<String, Person>>() {
            public int compare(Entry<String, Person> o1, Entry<String, Person> o2) {
                if (order) {
                    // Compare two Person objects based on last name
                    return o1.getValue().getLastName().compareTo(o2.getValue().getLastName());
                } else {
                    return o2.getValue().getLastName().compareTo(o1.getValue().getLastName());
                }
            }
        });

        // Prints the sorted HashMap
        Map<String, Person> sortedMap = new LinkedHashMap<String, Person>();
        for (Entry<String, Person> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        printMap(sortedMap);
    }

    // Method for printing the elements
    public void printMap(Map<String, Person> map) {
        System.out.println("Person\t\t\t\t\tAge");
        for (Entry<String, Person> entry : map.entrySet()) {
            System.out.println(entry.getValue().getFirstName() + " " + entry.getValue().getLastName() +
                    "\t\t\t" + entry.getValue().getAge());
        }
        System.out.println("\n");
    }
}
