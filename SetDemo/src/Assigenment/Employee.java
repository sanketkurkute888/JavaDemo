package Assigenment;

import java.util.Objects;

public class Employee implements Comparable<Employee>{
    int eid;
    String name;


    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public Employee(int eid) {
        this.eid = eid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        if(eid>o.getEid())
        {
            return 1;
        } else if (eid<o.getEid()) {
            return -1;
        }
        return 0;



    }




}
