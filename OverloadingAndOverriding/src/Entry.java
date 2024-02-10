import java.text.ParseException;

public class Entry {
    public static void main(String[] args) throws Exception {
        Base obj = new Derived();
        someFunction(obj);
    }

    public static void someFunction(Base obj) throws Exception {
       Developer d = new Developer();
        obj.function1(d);
        ((Derived)obj).add(10);
    }
}
