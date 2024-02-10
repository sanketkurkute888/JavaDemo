import java.util.Comparator;
import java.util.Random;

public class Student implements Comparable<Student>, SomeInterface{
    private String name;
    private int age;
    private int rollNo;

    @Override
    public void display() {
        System.out.println("Student Display Called");
    }

    /*******************************************/

    static public class NameComparator implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

    public class RollnoComparator implements Comparator<Student>{

        @Override
        public int compare(Student o1, Student o2) {
            return Integer.valueOf(o1.getRollNo()).compareTo(o2.getRollNo());
        }
    }

    public void initialCaps() {
        System.out.println("initialCaps");
        int a = 10;

        class InitCaps {
            public void doFirstCaps() {

                System.out.println("doFirstCaps " + a);
//                char ch = (char) (name.charAt(0) - 32);
//                name.replace(name.charAt(0), ch);
//
                String fLetter=name.substring(0,1);
                String remainLetter=name.substring(1,name.length());
                fLetter=fLetter.toUpperCase();
                name=fLetter+remainLetter;
                //a++;
            }
        }

        InitCaps obj = new InitCaps();
        obj.doFirstCaps();

        // a = 20;
    }
    /*******************************************/

    public Student(){
        this(null, 0);
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.rollNo = generateRollNo();
    }

    public int generateRollNo(){
        Random random = new Random();
        return random.nextInt(1, 100);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", rollNo=" + rollNo +
                '}';
    }

    @Override
    public int compareTo(Student student) {
        Integer age = getAge();
        return age.compareTo(student.getAge());
    }
}
