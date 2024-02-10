public class Manager extends Employee{
    private int numberOfSubordinates;

    public Manager(String name, String address, double salary, String jobTitle) {
        super(name, address, salary, jobTitle);
    }
    public int getNumberOfSubordinates()
    {
        return numberOfSubordinates;
    }
    public double calculateBonus()
    {
        return getSalary()*0.15;
    }
}
