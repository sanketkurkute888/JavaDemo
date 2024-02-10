import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Entry {
    public static void main(String[] args) {
//        Employee employee1 = new Employee(20, "Kiran", 10000);
//        Employee employee2 = new Employee(21, "Sanket", 20000);
//        Employee employee3 = new Employee(25, "Komal", 11000);
//        Employee employee4 = new Employee(24, "Sakshi", 12000);
//        Employee employee5 = new Employee(27, "Rohit", 30000);
//        Employee employee6 = new Employee(32, "Uday", 50000);
//        Employee employee7 = new Employee(33, "Shraddha", 60000);
//        Employee employee8 = new Employee(22, "Abhinav", 5000);
//
//        List<Employee> employees = new ArrayList<>();
//        employees.add(employee1);
//        employees.add(employee2);
//        employees.add(employee3);
//        employees.add(employee4);
//        employees.add(employee5);
//        employees.add(employee6);
//        employees.add(employee7);
//        employees.add(employee8);

//        employees.stream()
//                .filter(employee -> {
//                    System.out.println("Hello");
//                    return employee.getName().startsWith("S");
//                    });
                //.forEach(System.out::println);

//        employees.stream()
//                .filter(employee -> employee.getName().startsWith("S"))
//                .filter(employee -> employee.getSalary() >= 20000)
//                .forEach(System.out::println);

//        List<Employee> list = employees.stream()
//                .limit(5)
//                .filter(employee -> employee.getSalary() >= 10000)
//                .map(employee -> {
//                    employee.setName(employee.getName().toUpperCase());
//                    return employee;
//                })
//                .sorted()
//                .collect(Collectors.toList());
//                //.forEach(System.out::println);
//
//        System.out.println(list);

        /*********************************************************/

        Employee employee1 = new Employee(20, "Kiran", 10000);
        Employee employee2 = new Employee(21, "Sanket", 20000);
        Employee employee3 = new Employee(25, "Komal", 11000);
        Employee employee4 = new Employee(24, "Sakshi", 12000);
        Employee employee5 = new Employee(27, "Rohit", 30000);
        Employee employee6 = new Employee(32, "Uday", 50000);
        Employee employee7 = new Employee(33, "Shraddha", 60000);
        Employee employee8 = new Employee(22, "Abhinav", 5000);

        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        employees.add(employee6);
        employees.add(employee7);
        employees.add(employee8);

        Department hr = new Department("HR");
        Department it = new Department("IT");

        hr.setEmployees(List.of(employee1, employee2, employee3));
        it.setEmployees(List.of(employee4, employee5, employee6,employee7, employee8));

        List<Department> departments = new ArrayList<>();
        departments.add(hr);
        departments.add(it);

        departments.stream()
                .filter(department -> department.getDepartmentName().equals("HR"))
                .flatMap(department -> department.getEmployees().stream())
                .sorted()
                .forEach(System.out::println);

        /***************************************************************/

        //String[] arr = {"hello", "world", "welcome", "bye"};
        String[] arr = new String[10];

        Arrays.stream(arr)
                .map(String::toUpperCase)
                .forEach(System.out::println);

        arr = new String[10];
        System.out.println(arr);
    }
}
