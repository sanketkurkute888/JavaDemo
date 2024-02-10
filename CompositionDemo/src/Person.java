final public class Person {
    final private String name;
    final private int age;
    final private Address address;

    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = new Address(address.getFlatNo(), address.getStreet(), address.getPinCode(), address.getCity());
//        if(this.address.validatePincode()) {
//            System.out.println("Pincode validated");
//        }else{
//                System.out.println("Pincode validation failed");
//        }
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public int getAge() {
        return age;
    }

//    public void setAge(int age) {
//        this.age = age;
//    }

    public Address getAddress() {
        return new Address(address.getFlatNo(), address.getStreet(), address.getPinCode(), address.getCity());
    }

//    public void setAddress(Address address) {
//        this.address = address;
//    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}
