import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Entry {
    public static void main(String[] args) {
//    creating 5 object of the Student class
        Student s6 = new Student(23, "sanket", 6);
        Student s1 = new Student(23, "sanket", 1);
        Student s2 = new Student(25, "vaibhav", 2);
        Student s3 = new Student(21, "raju", 3);
        Student s4 = new Student(22, "banti", 5);
        Student s5 = new Student(20, "shyam", 4);

//    creating the array list of student
        List<Student> students = new ArrayList<>();

//    add the 5 element to the array list
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);


        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getAge() > o2.getAge())
                {
                    return 1;
                }
                else if(o1.getAge() < o2.getAge())
                {
                    return -1;
                }
                else {
                    return 0;
                }
            }
        });
//before sorting  the elements otf the list
        for (Student student : students
        ) {
            System.out.println(student);
        }


//        Sort the student according to name
        Collections.sort(students);

        //After sorting  the elements otf the list
        System.out.println("After sorting");
        for (Student student : students
        ) {
            System.out.println(student);
        }


////    Sort the Student list according to the rollnumber
        Collections.sort(students, new Student.RollNumberComparator());
        //after sorting  the elements otf the list
        System.out.println("After sorting");
        for (Student student : students
        ) {
            System.out.println(student);
        }


////  sort the Student list according to the age of student
       Collections.sort(students, new Student().new AgeComparator());
//
//        //after sorting  the elements otf the list
        System.out.println("After sorting");
        for (Student student : students
        ) {
            System.out.println(student);
        }
// call to someFunction
        students.get(0).someFunction();


// call to interface

        new SomeInterface() {
            public void display() {
                System.out.println("hello world");
            }
        }.display();

//        SomeInterface obj = new SomeInterface() {
//            public void display() {
//                System.out.println("hello world");
//            }
//        };
//        obj.display();
    }
}
