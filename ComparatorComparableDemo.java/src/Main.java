import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("sanket", "kurkute",34));
        personList.add(new Person("vaibhav", "kurkute",54));
        personList.add(new Person("reshma", "wable",89));
        personList.add(new Person("ganesh", "arangle",65));
        personList.add(new Person("pallavi", "arangle",34));
        personList.add(new Person("ramesh", "gadhe",21));
//
//        Collections.sort(personList, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getFirstName().compareTo(o2.getFirstName());
//            }
//        });
//
//        Collections.sort(personList, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getLastName().compareTo(o2.getLastName());
//            }
//        });


//  Collections.sort(personList);
//  Collections.sort(personList,new AgeComparator());
//
//        Collections.sort(personList, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                if(o1.getAge()>o2.getAge())
//                {
//                    return 1;
//                }
//                else if(o1.getAge()<o2.getAge())
//                {
//                    return -1;
//                }
//                return 0;
//            }
//        });
        for (Person person:personList) {
            System.out.println(person);
        }


    }

}