package Assigenment;

import java.util.List;

public class Person {
    private int age;
    private String name;
    private List<Address> address;

    public Person(int age, String name, List<Address> address) {
        this.age = age;
        this.name = name;
        this.address = address;
    }



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

//    @Override
//    public String toString() {
//        return "Person{" +
//                "age=" + age +
//                ", name='" + name + '\'' +
//                '}';
//    }


    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    @Override
    public int hashCode() {
        return age >>> 31;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Person person) {
            return name.equals(person.getName()) && age == person.getAge();//1 0
        }
        return false;
    }
}