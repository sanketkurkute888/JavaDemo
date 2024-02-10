public class SalaryEmployee extends Employee{
    private double annualSalary;

    private boolean isRetired;

    public SalaryEmployee()
    {
        this(0.0,false);
    }
    public SalaryEmployee(double annualSalary, boolean isRetired) {
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    public SalaryEmployee(int eid, String hire_date, double annualSalary, boolean isRetired) {
        super(eid, hire_date);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    public SalaryEmployee(String name, String birthDate, int eid, String hire_date, double annualSalary, boolean isRetired) {
        super(name, birthDate, eid, hire_date);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }



}
