import java.util.*;

public class Main {
    public static void main(String[] args) {

/*
//        creating person list
        List<Employee> employeeList = new ArrayList<>();

        Employee e1 = new Employee(21, "uday", 5000);
        Employee e2 = new Employee(23, "shivam", 4000);
        Employee e3 = new Employee(22, "ramakant", 6000);
        Employee e4 = new Employee(25, "ramakant", 7000);
        Employee e5 = new Employee(24, "rama", 6000);


        //        creating the list employee list
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);


//        printing the list
        System.out.println(employeeList);

//        printing the list after comparision
//         personList.sort(new ageComprator());

        Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if(o1.age>o2.age)
                {
                    return 1;
                } else if (o1.age<o2.age) {
                    return -1;
                }
                else {
                    return 0;
                }
            }
        });

//        after the sorting

        System.out.println("after sorting");
        for (Person e:employeeList) {
            System.out.println(e);
        }
  */

        List<Project> projects=new ArrayList<>();
        Project p1=new Project("Packman",34);
        Project p2=new Project("BattleGround",30);
        Project p3=new Project("Snipper3D",25);

        List<Project> projects1=new ArrayList<>();
        Project p4=new Project("Packman",34);
        Project p5=new Project("BattleGround",30);
        Project p6=new Project("Snipper3D",25);

        List<Project> projects2=new ArrayList<>();
        Project p7=new Project("Packman",34);
        Project p8=new Project("BattleGround",30);
        Project p9=new Project("Snipper3D",25);


//      Developer list
        List<Employee> devlopers=new ArrayList<>();
        Developer d1=new Developer(22,"sanket",15,152102,12,projects1);
        Developer d2=new Developer(21,"vaibhav",10,23444,200,projects1);
        Developer d3=new Developer(23,"raja",11,15002,200,projects2);

        devlopers.add(d1);
        devlopers.add(d2);
        devlopers.add(d3);

        System.out.println("after sorting");
        for (Person e:devlopers) {
            System.out.println(e);
        }


    }

}