import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class entryStream {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person(24,"Sanket"));
        list.add(new Person(32,"Rohit"));
        list.add(new Person(30,"Vijay"));
        list.add(new Person(29,"Shradhha"));
        list.add(new Person(35,"Uday"));

        list.stream().filter((p)->p.getAge()>25).forEach(System.out::println
        );


        list.stream().collect(Collectors.toSet()).forEach(System.out::println);


    }
}
