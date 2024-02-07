import java.util.ArrayList;
import java.util.List;

public class Entry1 {
    public static void main(String[] args) {
        Person person1 = new Person(20, "Komal");
        Person person6 = new Person(8, "Vijay");
        Person person2 = new Person(21, "Kiran");
        Person person3 = new Person(22, "Sanket");
        Person person4 = new Person(23, "shraddha");

        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person6);

        List<Person> personList1 = new ArrayList<>();
        personList1.add(person2);
        personList1.add(person3);
        personList1.add(person4);


        List<Department> departmentList = new ArrayList<>();

        departmentList.add(new Department("IT", personList));
        departmentList.add(new Department("HR", personList1));
//
//        departmentList.stream()
//                .flatMap(department -> departmentList.stream())
//                .forEach(person -> System.out.println(person));
//
//
//        personList.stream()
//                .limit(3)
//                //.filter(person -> person.getName().startsWith("K"))
//                .forEach(person -> System.out.println(person));
//
//        System.out.println(personList.stream().filter(person -> person.getName().startsWith("V"))
//                .allMatch(person -> person.getName().startsWith("V")));
//
//
//        personList.stream()
//                .limit(4)
//                //.filter(person -> person.getName().startsWith("K"))
//                .forEach(person -> System.out.println(person));

//        System.out.println("*".repeat(30));
//        departmentList.stream()
//                .flatMap(department -> departmentList.stream())
//                .forEach(person -> System.out.println(person));

//        System.out.println("*".repeat(30));
//        departmentList.stream()
//                .filter(department -> department.getDepartmentName().equals("HR"))
////                .flatMap(department -> departmentList.stream())
//                .forEach(person -> System.out.println(person));

//            personList.stream()
//                    .filter(person -> person.getName().endsWith("l"))
//                    .forEach(person -> System.out.println(person));
//




    }

}