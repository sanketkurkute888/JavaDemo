public class hourlyEmployee extends Employee{
    private double hourlyPayRate;

    public hourlyEmployee(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    public hourlyEmployee(int eid, String hire_date, double hourlyPayRate) {
        super(eid, hire_date);
        this.hourlyPayRate = hourlyPayRate;
    }

    public hourlyEmployee(String name, String birthDate, int eid, String hire_date, double hourlyPayRate) {
        super(name, birthDate, eid, hire_date);
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public double collectPay() {
        return super.collectPay();`
    }

    public double getDoublePay(double hourlyPayRate)
    {
        double doublePay=2*super.collectPay();
        return doublePay;
    }
}
