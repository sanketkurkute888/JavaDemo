import java.util.List;
import java.util.Random;

public  class Employee  extends Person  {
//data member
   protected int  emp_id;
    double salary;


//    constructor
    public Employee(int age, String name,double salary) {
        super(age, name);
        this.emp_id=generateEmployeeNumber();
        this.salary=salary;
    }


//    getter and setter

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
//    abstract public void  calculateSalary();

    public int generateEmployeeNumber()
    {
       Random random=new Random();
        int num = random.nextInt(900000) + 100000; // Generating a 6-digit random number
        return  num;
    }


    public double calculateSalary(){
        return 0;
    }
    @Override
    public String toString() {
        return super.toString()+"Employee{" +
                "emp_id=" + emp_id +
                ", salary=" + salary +
                '}';
    }
}


