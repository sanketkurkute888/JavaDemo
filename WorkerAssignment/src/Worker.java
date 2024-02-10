import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Worker {
    protected String name;
    protected String birthDate;
    protected String endDate;

    public Worker() {
        this(null, null);

    }

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public double collectPay(){
        return 0.0;
    }

    public void terminate(String endDate){
        this.endDate = endDate;
        System.out.println("Terminate Date: "+this.endDate);
    }

    public int getAge() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date formattedBirthDate = simpleDateFormat.parse(birthDate);
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(formattedBirthDate);
        int birthYear = calendar.get(Calendar.YEAR);

        Date currentDate = new Date();
        calendar.setTime(currentDate);
        int currentYear = calendar.get(Calendar.YEAR);

        return currentYear - birthYear;
    }
}
