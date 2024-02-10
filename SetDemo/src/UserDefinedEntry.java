import java.util.HashSet;
import java.util.Set;

public class UserDefinedEntry {
    public static void main(String[] args) {
        Person person1 = new Person(20, "Abhinav");
        Person person2 = new Person(21, "Uday");
        Person person3 = new Person(22, "Shraddha");
        Person person4 = new Person(23, "Abhinav");

        Set<Person> people = new HashSet<>();
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);

        System.out.println(people);

    }
}
