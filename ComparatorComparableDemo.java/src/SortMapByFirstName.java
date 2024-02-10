import java.util.*;

public class SortMapByFirstName {

    Map<String, Person> map = new HashMap<>();

    public static void main(String[] args) {
        SortMapByFirstName sv = new SortMapByFirstName();
        sv.createMap();
//        System.out.println("Sort the values by person first name");
//        sv.sortByPersonFirstName(true);
//        System.out.println("Sort the values by person first name");
//        sv.sortByPersonFirstName(false);
        //sv.sortByAge();

        sv.sortByAge();
    }

    private void sortByAge() {
         List<Map.Entry<String,Person>> list=new LinkedList<Map.Entry<String,Person>>(map.entrySet());
         Collections.sort(list, new Comparator<Map.Entry<String, Person>>() {
             @Override
             public int compare(Map.Entry<String, Person> o1, Map.Entry<String, Person> o2) {
             return  Integer.compare(o1.getValue().getAge(),o2.getValue().getAge());
             }
         });

         Map<String,Person> sortedMap=new LinkedHashMap<>();
         for (Map.Entry<String,Person> entry:list)
         {
             sortedMap.put(entry.getKey(),entry.getValue());
         }
         printMap(sortedMap);
    }

    public void sortByPersonFirstName(boolean order) {
        List<Map.Entry<String, Person>> list = new LinkedList<>(map.entrySet());

        //sort the list by the person first name;
        Collections.sort(list, new Comparator<Map.Entry<String, Person>>() {
            @Override
            public int compare(Map.Entry<String, Person> o1, Map.Entry<String, Person> o2) {
                if (order) {
                    return o1.getValue().getFirstName().compareTo(o2.getValue().getFirstName());
                } else {
                    return o2.getValue().getFirstName().compareTo(o1.getValue().getFirstName());
                }

            }
        });

        Map<String, Person> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Person> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }



























        printMap(sortedMap);
    }

    private void createMap() {
        map.put("Sanket", new Person("Sanekt", "Kurkute", 26));
        map.put("Vaibhav", new Person("Sanekt", "Kurkute", 23));
        map.put("Ramesh", new Person("Ramesh", "Gadhe", 30));
        map.put("Mangesh", new Person("Mangesh", "Adhav", 28));
        map.put("Digviay", new Person("Digvijay", "Bhalsing", 28));
        map.put("Digvijy", new Person("Digvijay", "Bhalsing", 29));

        printMap(map);
    }

    private void printMap(Map<String, Person> map) {
        for (Map.Entry<String, Person> entry : map.entrySet()) {
            System.out.println(entry.getValue().getFirstName() + " " + entry.getValue().getLastName() + " " + entry.getValue().getAge());
        }
        System.out.println("\n");
    }
}
