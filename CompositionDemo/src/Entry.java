public class Entry {
    public static void main(String[] args) {
//        Address address = new Address(101, "Balewadi HighStreet", 123456, "Pune");
//
//        Person person = new Person("Rohit", 23, address);
//        //person.getAddress().setFlatNo(102);
//        System.out.println(person);
//
//        address.setFlatNo(102);
//        System.out.println(person);

        Address address = new Address(101, "Balewadi HighStreet", 123456, "Pune");
        Person person = new Person("Rohit", 23, address);
        System.out.println(person);

        //person.getAddress().setFlatNo(102);
        address.setFlatNo(102);
        System.out.println(person);
    }
}
