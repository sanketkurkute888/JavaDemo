public class MyClass {
    private String message;
    private static int count;

    static {
        System.out.println("Static block called 1");
    }

    static {
        System.out.println("Static block called 2");
    }

    {
        System.out.println("Instance block called 1 "+message);
    }

    {
        System.out.println("Instance block called 2");
    }

    public MyClass(){
        System.out.println("Constructor called");
        count++;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void printMessage(){
        System.out.println("Your message "+message);
    }

    public static int totalObjects(){
        return count;
    }
}
