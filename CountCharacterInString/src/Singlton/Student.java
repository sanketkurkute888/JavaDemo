package Singlton;

public class Student {
    int age;
    String name;
    private  static Student  instance;
    private Student() {

    }
    public  static  Student getInstance()
    {
        if(instance==null)
        {
            instance=new Student();
            System.out.println("Object cretated");
        }
        return instance;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
