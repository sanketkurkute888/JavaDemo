import java.util.*;
import java.util.stream.Collectors;

public class Entry1 {
    public static void main(String[] args) {
        Person person1 = new Person(20, "Komal");
        Person person6 = new Person(8, "Vijay");
        Person person2 = new Person(21, "Kiran");
        Person person3 = new Person(22, "Sanket");
        Person person4 = new Person(23, "shraddha");

        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person6);

        List<Person> personList1 = new ArrayList<>();
        personList1.add(person2);
        personList1.add(person3);
        personList1.add(person4);


        List<Department> departmentList = new ArrayList<>();

        departmentList.add(new Department("IT", personList));
        departmentList.add(new Department("HR", personList1));
//
//        departmentList.stream()
//                .flatMap(department -> departmentList.stream())
//                .forEach(person -> System.out.println(person));
//
//
//        personList.stream()
//                .limit(3)
//                //.filter(person -> person.getName().startsWith("K"))
//                .forEach(person -> System.out.println(person));
//
//        System.out.println(personList.stream().filter(person -> person.getName().startsWith("V"))
//                .allMatch(person -> person.getName().startsWith("V")));
//
//
//        personList.stream()
//                .limit(4)
//                //.filter(person -> person.getName().startsWith("K"))
//                .forEach(person -> System.out.println(person));

//        System.out.println("*".repeat(30));
//        departmentList.stream()
//                .flatMap(department -> departmentList.stream())
//                .forEach(person -> System.out.println(person));

//        System.out.println("*".repeat(30));
//        departmentList.stream()
//                .filter(department -> department.getDepartmentName().equals("HR"))
////                .flatMap(department -> departmentList.stream())
//                .forEach(person -> System.out.println(person));

//            personList.stream()
//                    .filter(person -> person.getName().endsWith("l"))
//                    .forEach(person -> System.out.println(person));
//




//        ************************************************************************************************************
         List<Product> productList=new LinkedList<>();
         productList.add(new Product(101,"Laptop",34000));
        productList.add(new Product(103,"TV",50000));
        productList.add(new Product(102,"Mobile",30000));
        productList.add(new Product(104,"Refrigerator",20000));
        productList.add(new Product(105,"Bike",100000));
        productList.add(new Product(106,"Tablet",60000));

        Optional<Product> maxPriceProduct=productList.stream().max((p1,p2)->Double.compare(p1.getPrice(),p2.getPrice()));
        maxPriceProduct.ifPresent(Product-> System.out.println(Product.getPrice()));
//
//
//
//         List<Float>  pr=productList.stream()
//                 .filter(product -> product.getPrice()>30000)
//                 .map(product -> product.getPrice())
//                 .collect(Collectors.toList());
//
//
//        System.out.println("*".repeat(23));
//
//        List<Float> productPriceList2 =productList.stream()
//                .filter(p -> p.getPrice() > 30000)// filtering data
//                .map(p->p.getPrice())        // fetching price
//                .collect(Collectors.toList()); // collecting as list
//        System.out.println(productPriceList2);


//  show the deatils of those product name whose product price is 60000
//        System.out.println("*".repeat('^'));
              productList.stream()
                      .filter(product -> product.getPrice()==60000)
                      .forEach(product -> System.out.println(product.getName()));



              productList.stream()
                      .distinct().filter(product -> Boolean.parseBoolean(product.getName().substring(0,1))).forEach(product -> System.out.println(product));

              List<Integer> integerList= Arrays.asList(1,2,3,45,23,4,23);

              Optional<Integer> maxInteger =integerList.stream()
                      .max(Integer::compareTo);
              maxInteger.ifPresent(p-> System.out.println("Max number"+p));


              Optional<Integer> minelement=integerList.stream().min(Integer::compareTo);
              minelement.ifPresent(System.out::println);

              Optional<Integer> secondhighest=integerList.stream()
                      .findAny().
    }

}