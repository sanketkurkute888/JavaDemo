package Assigenment;

import java.util.*;

public class Main {
    List<Address> addressList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static Person userInformation() {
        System.out.println("Enter the age of person");
        int age = scanner.nextInt();
        System.out.println("Enter the name of person");
        scanner.nextLine();
        String name = scanner.nextLine();

        return new Person(age, name, manageAdress());
    }

    public static List<Address> manageAdress() {

        String ch = "yes";
        Set<Address> addressSet = new HashSet<>();
        do {
            addressSet.add(addressInformation());
            System.out.println("Do you want to continue press : yes .for exit press: no");
            ch = scanner.nextLine();
        } while (ch.equals("yes"));

        List<Address> arrayList = new ArrayList<Address>();
        arrayList.addAll(addressSet);

        return arrayList;
    }

    private static Address addressInformation() {
        System.out.println("Enter the pincode");
        int pincode = scanner.nextInt();
        System.out.println("Enter the street");
        scanner.nextLine();
        String street = scanner.nextLine();

        return new Address(street, pincode);
    }

    //    print the data of list
    public static void printInformation(List<Person> personList) {
        for (Person person : personList
        ) {
            System.out.println(person);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ch = "yes";

        Set<Person> personSet = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if(o1.getAge()> o2.getAge())
                {
                    return 1;
                }
                else if(o1.getAge()< o2.getAge())
                {
                    return -1;
                }
               return 0;
            }
        });

//After sorting
        Iterator<Person> iterator = personSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        do {
            personSet.add(userInformation());
            System.out.println("Do you want to continue press : yes .for exit press: no");
            ch = scanner.nextLine();
        } while (ch.equals("yes"));


//        convert to list
        List<Person> arrayList = new ArrayList<Person>();
        arrayList.addAll(personSet);


//        call print the list
        printInformation(arrayList);

//        sort


    }
}
