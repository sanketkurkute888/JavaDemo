import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tester extends Employee {

    int overtimeHour;
    double payRate;
    List<Project> projects;

    public Tester(int age, String name, int overtimeHour, double salary,double payRate) {
        super(age, name,salary);
        this.overtimeHour = overtimeHour;
        this.payRate=payRate;
        this.projects = new ArrayList<>();
    }


    @Override
    public double calculateSalary() {
        return salary+(overtimeHour*payRate);
    }

    @Override
    public String toString() {
        return super.toString() +", total salary="+calculateSalary();
    }
}
