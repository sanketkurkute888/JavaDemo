//import java.util.*;
//
//public class SortByAgeComparator implements Comparator<SortMapByFirstName> {
//
//
//    @Override
//    public int compare(SortMapByFirstName o1, SortMapByFirstName o2) {
//        List<Map.Entry<String, Person>> list = new LinkedList<>();
//        Collections.sort(list, new Comparator<Map.Entry<String, Person>>() {
//            @Override
//            public int compare(Map.Entry<String, Person> o1, Map.Entry<String, Person> o2) {
//                if (o1.getValue().getAge() > o2.getValue().getAge()) {
//                    return 1;
//                } else if (o1.getValue().getAge() < o2.getValue().getAge()) {
//                    return -1;
//                }
//                return 0;
//            }
//        });
//
//    }
//}
