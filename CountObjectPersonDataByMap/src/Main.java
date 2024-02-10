import java.util.*;

public class Main {
    public static void main(String[] args) {
//        create array list
        List<Person> personList=new ArrayList<Person>();
        personList.add(new Person(10,"sanket"));
        personList.add(new Person(10,"sanket"));
        personList.add(new Person(10,"sanket"));
        personList.add(new Person(12,"uday"));
        personList.add(new Person(10,"uday"));
        personList.add(new Person(11,"ram"));
        personList.add(new Person(13,"vijay"));
        personList.add(new Person(14,"ganesh"));

        System.out.println(personList);

        Map<Person, Integer> countMap = new HashMap<>();

        for (Person person : personList) {
            countMap.put(person, countMap.getOrDefault(person, 0) + 1);
        }

        // Print the counts`
        for (Map.Entry<Person, Integer> entry : countMap.entrySet()) {
            Person person = entry.getKey();
            int count = entry.getValue();
            System.out.println("Age: " + person.getAge() + ", Name: " + person.getName() + ", Count: " + count);
        }

        TreeMap<Person, String> userMap = new TreeMap<>();
//        userMap.put(new Person(21,"sanket"));
//      usermap.put(new Person(21, "sanket"));

//        logic to sort according to entry set

    }


}