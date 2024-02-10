import java.sql.SQLData;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Base {

    public Developer function1(Person developer) throws ParseException {
        System.out.println("Base");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yy");
       // simpleDateFormat.parse("12/12/2023");

        return new Developer();
    }

    public void add(int a, int b){
        System.out.println(a+b);
    }
}
