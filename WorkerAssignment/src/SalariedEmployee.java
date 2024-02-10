import java.text.SimpleDateFormat;
import java.util.Date;

public class SalariedEmployee extends Employee {
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee() {
        this(null, null, null, 0);
    }

    public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = false;
    }

    public void retire(){
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String terminateDate = simpleDateFormat.format(date);

        terminate(terminateDate);
        isRetired = true;
        System.out.println("Employee Terminated");
    }

    @Override
    public double collectPay() {
        return isRetired ? (annualSalary/12)+1000 : annualSalary/12;
    }
}
