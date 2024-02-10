import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LamdaListDemo {
    public static void main(String[] args) {
        Person person1 = new Person(20, "Komal");
        Person person6 = new Person(8, "Vijay");
        Person person2 = new Person(21, "Kiran");
        Person person3 = new Person(22, "Sanket");
        Person person4 = new Person(23, "shraddha");

        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person6);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);

//        for (int i = 0; i < 5; i++) {
//            System.out.println(personList.get(i));
//        }


   //    personList.forEach(person -> System.out.println(person));
        //personList.forEach(System.out::println);
//
//        Comparator<Person> nameComparator=new Comparator<Person>(){
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        };


//        Comparator<Person> ageComparator= (o1, o2) -> Integer.compare(o1.getAge(),o2.getAge());
//
//        Comparator<Person> personComparator1 = (p1, p2) -> p1.getName().compareTo(p2.getName());
//
//        personList.sort(personComparator1);
//        System.out.println("*".repeat(30));
//        personList.forEach(person -> System.out.println(person));


//        MyFunctionalInterface functionalInterface = new MyFunctionalInterface(){
//            @Override
//            public void functionalMethod() {
//                System.out.println("From functional method");
//            }
//        };

//        MyFunctionalInterface functionalInterface5 = () ->  System.out.println("From functional method");
//        callingFunction(() ->  System.out.println("From functional method"));

//         functionalInterface5.functionalMethod();

//        ******************************************************************************
//        MyFunctionalInterface1 functionalInterface1 = (a, b) -> {
//            return a + b;
//        };
//        int ans = functionalInterface1.add1(3, 7);
//        System.out.println(ans);

//        ******************************************************************************
//        MyFunctionalInterface1 functionalInterface3 = (a, b) -> a + b;
//        System.out.println(functionalInterface3.add1(78, 90));
//
//        Consumer<Person> consumer = (p) -> System.out.println(p.getName().toUpperCase());
//        consumerCalling(consumer, personList);

        Consumer<Person> consumer1 = (p) -> {
            int lastIndex = p.getName().length() - 1;//4
            char lastChar = p.getName().charAt(lastIndex);//l
            String s = p.getName().substring(0, lastIndex) + Character.toUpperCase(lastChar);
//                                      Koma                      +       L
            p.setName(s);
        };
        consumer1Calling(consumer1, personList);
        personList.forEach(person -> System.out.println(person));

//        Consumer<Person> consumer1=(p5)-> System.out.println(p5.getName().lastIndexOf(p5.getName()));
//        consumer1Calling(consumer1,personList);
//********************************************************************************
//        Function<Person> consumer1=(p1)->System.out.println(p1.getName().replaceAll());

//        Predicate<Person> predicate=(person -> person.getName().startsWith("K"));
//        predicateCalling(predicate,personList);


//**********************************************************************************
//        Function<Person, Person> function = (p4) -> {
//            p4.setName(p4.getName() + "Hello");
//            return p4;
//        };
//        FunctionCalling(function, personList);
//
//        personList.forEach(System.out::println);
//********************************************************************************
//        Supplier<Integer> supplier = ()->new Random().nextInt(0,4);
//        supplierDemo(supplier,personList);

// ********************************************************************************



    }
//********************************************************************************

    private static void FunctionCalling(Function<Person, Person> function, List<Person> personList) {
        for (Person person : personList) {

            function.apply(person);
        }
    }

//    private static void supplierCalling(Supplier<Person> supplier, List<Person> personList) {
//        for (Person person:personList) {
//
//            if(supplier.get())
//            {
//                System.out.println(person);
//            }
//        }
//    }

    private static void predicateCalling(Predicate<Person> predicate, List<Person> personList) {
        for (Person person : personList) {

            if (predicate.test(person)) {
                System.out.println(person);
            }
        }
    }

    private static void consumer1Calling(Consumer<Person> consumer1, List<Person> personList) {
        for (Person person : personList) {
            consumer1.accept(person);
        }
    }

    private static void consumerCalling(Consumer<Person> consumer, List<Person> personList) {
        for (Person person : personList) {
            consumer.accept(person);
        }
    }


    public static void callingFunction(MyFunctionalInterface functionalInterface) {
        functionalInterface.functionalMethod();
    }

    public static void convertToUpperCase(Consumer consumer, List<Person> personList) {
        consumer.accept(personList);
    }

    public static void supplierDemo(Supplier<Integer> supplier, List<Person> personList) {
        for (int i = 0; i < 5; i++) {
            int ranNo = supplier.get();
            System.out.println(personList.get(ranNo));
        }
    }
}
