package ComputerInformation;

public class ComputerCase {
    final private String model;
    final private String manufacturer;






//    constructor
    public ComputerCase(String model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;

    }


//    getter
    public String getModel() {
        return model;
    }
    public String getManufacturer() {
        return manufacturer;
    }

//methods
    public void computerCaseWorking()
    {

    }



    //toString
    @Override
    public String toString() {
        return "ComputerCase{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
