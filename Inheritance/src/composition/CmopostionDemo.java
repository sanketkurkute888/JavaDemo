package composition;

class Address
{
    String pincode,state,home;
//  constructor


    public Address(String pincode, String state, String home) {
        this.pincode = pincode;
        this.state = state;
        this.home = home;
    }

//    displaying the data of the address class
    @Override
    public String toString() {
        return "Address{" +
                "pincode='" + pincode + '\'' +
                ", state='" + state + '\'' +
                ", home='" + home + '\'' +
                '}';
    }


//
}
class Employee {
    int id;
    String name;
    Address address;

//    costructor

    public Employee(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;

    }
//    display data of employee class

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
//    displaying the data using the method
    public void display()
    {
        System.out.println("Employee id" + id+"employee name " +name);
        System.out.println("Pincode "+address.pincode+
                            "State "+address.state+
                            "Home "+address.home);
    }

}
public class CmopostionDemo {

    public static void main(String[] args) {


//    create object of the Address class
        Address address1 = new Address("413706", "mh", "anjaliniwas");
        Address address2 = new Address("413707", "mh", "pandu niwas");


//    create the object of the Employee class
        Employee employee1 = new Employee(101, "sanket", address1);


//    dispalying the the information
//        System.out.println(employee1.toString());


//    call to the diplay method employee class
            System.out.println(employee1.toString());
}

}
