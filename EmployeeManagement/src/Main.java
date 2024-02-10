import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {
        Worker worker=new Worker("sanket","1997-06-21");
        hourlyEmployee hourlyEmployee=new hourlyEmployee("sanket","21-06-1997",101,"30-12-2023",100.00);
        worker.getAge();
    }
}