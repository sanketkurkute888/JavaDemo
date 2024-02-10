import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Entry {
    public static void main(String[] args) {
        Student student1 = new Student("komal", 25);
        Student student2 = new Student("sakshi", 21);
        Student student3 = new Student("sanket", 28);
        Student student4 = new Student("uday", 32);
        Student student5 = new Student("rohit", 40);

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        //Collections.sort(students);
        //Collections.sort(students, new Student.NameComparator());
       // Collections.sort(students, new Student().new RollnoComparator());
        listStudents(students);

//        Student s = new Student();
//        s.display();

//        new SomeInterface(){
//            @Override
//            public void display() {
//                System.out.println("Anonymous called");
//            }
//        }.display();

        //s.display();

    }

    public static void listStudents(List<Student> students){
        for (Student student: students) {
            student.initialCaps();
            System.out.println(student);
        }
    }
}
