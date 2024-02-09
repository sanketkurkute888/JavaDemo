package ComputerInformation;

public class Motherbord {
    //    data member
    final private String type;


//    constructor
    public Motherbord(String type) {
        this.type = type;
    }


//    getter
    public String getType() {
        return type;
    }

//    method
    public void motherboardWorking()
    {
        System.out.println("Motherboard working");
    }


//    to string
    @Override
    public String toString() {
        return "Motherbord{" +
                "type='" + type + '\'' +
                '}';
    }
}
