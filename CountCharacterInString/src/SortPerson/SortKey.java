package SortPerson;

import java.util.Comparator;

class SortKey implements Comparator<Student> {

    @Override
    public int compare(Student person1, Student person2) {
        // Implement comparison based on names
        return person1.getName().compareTo(person2.getName());
    }
}