package SortPerson;

import java.util.TreeMap;
public class Entry {
    public static void main(String[] args) {

        TreeMap<Student, Contact> treeMap = new TreeMap<>(new SortKey());
        // Example usage:
        Student person1 = new Student("Sanket");
        Student person4 = new Student("Vaibhav");
        Student person2 = new Student("Rajendra");
        Student person3 = new Student("Mangeshb");

        // Add persons to the TreeMap
        treeMap.put(person1, new Contact());
        treeMap.put(person2, new Contact());
        treeMap.put(person3, new Contact());
        treeMap.put(person4, new Contact());
        // TreeMap will be sorted based on names

        for (Student person : treeMap.keySet()) {
            System.out.println("Name: " + person.getName());
        }
    }
}
