public class myClass1 {

    private String message;
    private static int objectCounter;
    public myClass1() {
    }

    public myClass1(String message) {
        this.message = message;
        objectCounter++;
    }

    public void setMessage(String message)
    {
        this.message=message;
    }
    public String getMessage()
    {
        return message;
    }

    public static int objCount()
    {
      return objectCounter;
    }



}
