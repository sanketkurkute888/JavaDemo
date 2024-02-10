import java.util.Date;
import java.util.Stack;

public class Main {
    public static void main(String[] args)  {
        Person p1 = new Person(30, "Sanket");
        Person p2 = new Person(30, "Sanket");
        Person p3 = new Employee(30, "Sanket");

        Employee e1 = new Employee(35, "Vaibhav");
        Employee e2 = new Employee(30, "Sanket");
        Developer d1 = new Developer(25, "Sonal");

//        System.out.println(p1.equals(new String()));

        // Checking equality using overridden equals method in Person class
        System.out.println("p1.equals(p2): " + p1.equals(p2)); // Output: true
        System.out.println("p1.equals(e1): " + p1.equals(e1)); // Output: false
        System.out.println("p1.equals(d1): " + p1.equals(d1)); // Output: false
        System.out.println("p1.equals(e2): " + p1.equals(e2)); // Output:
        System.out.println("p1.equals(p3): " + p1.equals(p3)); // Output:
    }
}