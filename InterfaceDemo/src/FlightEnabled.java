import java.util.Date;

public interface FlightEnabled {

    public final static int testData = 10;

    public void fly();
    public abstract void land();
    void takeOff();


    default void trackData(){
        System.out.println("X and Y co-ordinates are tracked at date :"+new Date());
    }

    static void log(){
        System.out.println("Logs captured at "+new Date());
    }
}
