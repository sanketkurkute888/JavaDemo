public class Entry {
    public static void main(String[] args) {
        Person person = new Person(20, "ABC");
//        System.out.println(person);
        System.out.println(person.toString());



        Employee employee=new Employee(20,"sanket");
        System.out.println(employee.getEmployeeId());
        System.out.println(employee.getEmployeeName());
    }
}
