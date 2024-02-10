package PersonMapDemo;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Map<Person, Integer> personIntegerMap = new HashMap<>();
        List<Person> personList = new ArrayList<>();
        Person person1 = new Person("Uday",21);
        Person person2 = new Person("Sanket",26);
        Person person3 = new Person("Abhinav",23);
        Person person4 = new Person("Abhinav",23);
        Person person5 = new Person("Abhinav",23);
        Person person6 = new Person("Rohit",27);
        Person person7 = new Person("Aniket",25);

        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);
        personList.add(person5);
        personList.add(person6);
        personList.add(person7);

//        System.out.println(personList);
        printList(personList);
        countPerson(personList);
//        sortByName(personList);

    }
    public static void printList(List<Person> personList){
        for (Person person:personList) {
//            Collections.sort(personList);
            System.out.println(person);
        }
    }



//    public static void sortByName(List<Person> personList)
//    {
//        Map<Person ,String> personStringMap=new TreeMap<>( new NameComparator());
//
//        System.out.println("After sorting by name");
//        for (Map.Entry<Person, String> map: personStringMap.entrySet()) {
//            System.out.println(map.getKey()+" Count is : "+map.getValue()+" ");
//        }
//    }
    public static void countPerson(List<Person> personList){
        Map<Person, Integer> personIntegerMap = new TreeMap<>(new AgeComparator());
//        Map<Person ,String> personStringMap=new TreeMap<>( new NameComparator());
//        Map<Person, Integer> personIntegerMap = new TreeMap<>(Comparator.naturalOrder());
//        Map<Person, Integer> personIntegerMap = new TreeMap<>(Comparator.reverseOrder());

        for (Person person: personList)
        {
            if(personIntegerMap.containsKey(person)){
                personIntegerMap.put(person, personIntegerMap.get(person)+1);
            }
            else {
                personIntegerMap.put(person,1);
            }
        }
        for (Map.Entry<Person, Integer> map: personIntegerMap.entrySet()) {
            System.out.println(map.getKey()+" Count is : "+map.getValue()+" ");
        }
    }

}