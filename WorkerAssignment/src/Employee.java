import java.util.Random;

public class Employee extends Worker{
    protected int employeeId;
    protected String hireDate;

    public Employee() {
        this(null, null, null);
    }

    public Employee(String name, String birthDate, String hireDate) {
        super(name, birthDate);
        this.hireDate = hireDate;

        Random random = new Random();
        employeeId = random.nextInt(10, 1000);
    }
}
