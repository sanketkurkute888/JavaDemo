class Employee
{
    float salary=45000;
}
class Programmer extends Employee
{
    float bonus=4500;
}
public class Main {
    public static void main(String[] args)
    {


        Programmer p1=new Programmer();
        System.out.println("Employee "+p1.salary);
        System.out.println("Programmmer "+p1.bonus);
    }
}