import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Derived extends Base{


    public Developer function1(Person person) throws NullPointerException
    {
        System.out.println("Derived");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yy");
       // simpleDateFormat.parse("12/12/2023");
        return new Developer();
    }

    public void add(int a){
        System.out.println(a);
    }
}
