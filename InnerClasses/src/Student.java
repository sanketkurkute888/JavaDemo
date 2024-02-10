import java.util.Comparator;

public class Student implements Comparable<Student>{

//   create data member
    private int age;
    private String name;

    private int rollNo;

//    creating constuctor
    public Student(int age, String name, int rollNo) {
        this.age = age;
        this.name = name;
        this.rollNo = rollNo;
    }

    public Student() {

    }

//    setter and getter

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

//    overriding the toString method

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }

//    override the compareTo method because use of the interface Comparable
    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }

//    1 way to create the class int  class ====> using static class
    public static class RollNumberComparator implements Comparator<Student>
   {
       @Override
       public int compare(Student o1, Student o2) {

           if(o1.getRollNo()>o2.getRollNo())
           {
               return  1;
           } else if (o1.getRollNo()<o2.getRollNo()) {
               return -1;
           }
           else
           {
                return 0;
           }
       }
   }

//   2nd way to create  the class inside class ===> using simple class

    public class AgeComparator implements Comparator<Student>
    {
        @Override
        public int compare(Student o1, Student o2) {
           if (o1.getAge()<o2.getAge())
           {
               return -1;
           }
           else if(o1.getAge()>o2.getAge())
           {
               return 1;
           }
           else
           {
               return 0;
           }
        }
    }

// 4 way to create the class using annoymus class

    public void someFunction()
    {
        int a=10;
        System.out.println("Some function is called");

        class SomeClass
        {
            public void localClassFuntion()
            {
                System.out.println("from local class functioln"+a);
            }
        }

//        here created object of SomeClass
        SomeClass someClass=new SomeClass();
        someClass.localClassFuntion();
    }


}
