package ComputerInformation;

final  public class PersonalComputer extends Product {
    private final String companyName;

//    compositon member
    private Monitor monitor;
    private ComputerCase computerCase;
    private Motherbord motherbord;



//    constructor


//    public PersonalComputer(String companyName, Monitor monitor, ComputerCase computerCase, Motherbord motherbord) {
//        this.companyName = companyName;
//        this.monitor = monitor;
//        this.computerCase = computerCase;
//        this.motherbord = motherbord;
//    }

    public PersonalComputer(int product_id, String productName, int price, double weight, String type, String companyName, Monitor monitor, ComputerCase computerCase, Motherbord motherbord) {
        super(product_id, productName, price, weight, type);
        this.companyName = companyName;
        this.monitor = monitor;
        this.computerCase = computerCase;
        this.motherbord = motherbord;
    }

    public  void personalComputerWorking()
    {
        monitor.monitorWorking();
        computerCase.computerCaseWorking();
        motherbord.motherboardWorking();
    }
    //    to string method
    @Override
    public String toString() {
        return "PersonalComputer{" +
                "companyName='" + companyName + '\'' +
                ", product_id=" + product_id +
                ", ProductName='" + ProductName + '\'' +
                ", price=" + price +
                '}'+
                super.toString();
    }
}
