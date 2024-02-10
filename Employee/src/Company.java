import java.util.List;
public class Company <T extends Employee>{

    List<T> employees;

    private String name;

    public Company(List<T> employees, String name) {
        this.employees = employees;
        this.name = name;
    }

    public void addPlayer(T employee) {
        if (employees.contains(employee)) {
            System.out.println("Player Already Present");
        } else {
            employees.add(employee);
        }
    }

    public void  listEmployees()
    {
        employees.sort(new ageComprator());
        for (T employee : employees) {
            System.out.println(employee);
        }
    }


}
