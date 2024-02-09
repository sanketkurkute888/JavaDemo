package SmartKitchen;

public class Washer {

    private  boolean doDishes;

    public void setDoDishes(boolean doDishes) {
        this.doDishes = doDishes;
        washDishes();
    }

    public void washDishes()
    {
        System.out.println("washing dishes");

    }

}
