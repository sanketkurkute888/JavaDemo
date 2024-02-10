import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Worker {
    private String name;

    private String birthDate;

    private String endDate;


    public Worker() {
        this(null, null);
    }

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
//        this.endDate = endDate;
    }

    public void getAge() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date dateOfBirth = sdf.parse(birthDate);
        Calendar dob = new GregorianCalendar();
        dob.setTime(dateOfBirth);
        Calendar today = Calendar.getInstance();
        int age = today.get(Calendar.YEAR) - dob.get(Calendar.YEAR);
        System.out.println(age);

    }

    public double collectPay() {
        return 0.0;
    }

   public String terminate(String endDate)
   {
       return endDate;
   }

}

