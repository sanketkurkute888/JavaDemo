import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Developer extends Employee{

    int overtimeHour;

    List<Project> projects;

    double payRate;

    public Developer(int age, String name, int overtimeHour, double salary,double payRate,List<Project> projects) {
        super(age, name,salary);
        this.overtimeHour = overtimeHour;
        this.payRate=payRate;
        this.projects = projects;
    }

    @Override
    public double calculateSalary() {
        return salary+(overtimeHour*payRate);
    }

    @Override
    public String toString() {
        return super.toString() +", total salary="+calculateSalary()+projects.toString();
    }



}
