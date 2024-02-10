package Assigenment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Entry {
    public static void main(String[] args) {
//      cretaint object of person
       Employee employee1=new Employee(101);
        Employee employee2=new Employee(102);
        Employee employee3=new Employee(103);
        Employee employee4=new Employee(104);
        Employee employee5=new Employee(105);

        List<Employee> employeeList=new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);

//        before suffeling

        System.out.println(employeeList);

        Collections.reverse(employeeList);

//        after suffeling
        System.out.println(employeeList);

//        sort the data

        Collections.binarySearch(employeeList,employee1);

//        Collections.sort(employeeList);
        System.out.println(employeeList);

        Collections.reverse(employeeList);
        System.out.println(employeeList);

//
//        Collections.binarySearch(employeeList,102,);
    }
}
