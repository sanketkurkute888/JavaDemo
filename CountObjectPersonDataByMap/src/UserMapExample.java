import java.util.*;

class Person1 implements Comparable<Person1> {
    private String name;
    private int age;

    public Person1(String name,int age) {
        this.name = name;
        this.age=age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Person1 otherUser) {
        return this.name.compareTo(otherUser.getName());
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null || getClass() != obj.getClass()) {
//            return false;
//        }
//        Person1 otherUser = (Person1) obj;
//        return Objects.equals(name, otherUser.name);
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person1 person1 = (Person1) o;
        return age == person1.age && Objects.equals(name, person1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

public class UserMapExample {
    public static void main(String[] args) {
        // Create a TreeMap with a custom comparator based on User's natural ordering (name)
        TreeMap<Person1, String> userMap = new TreeMap<>();

        // Add users to the map
        userMap.put(new Person1("John",21), "User 1 Data");
        userMap.put(new Person1("zelinki", 22), "User 4 Data");
        userMap.put(new Person1("Alice",30), "User 2 Data");
        userMap.put(new Person1("Bob",67), "User 3 Data");

        // Display the sorted map
        for (Map.Entry<Person1, String> entry : userMap.entrySet()) {
            System.out.println("User: " + entry.getKey().getName() + ", Data: " + entry.getValue());
        }
    }
}
