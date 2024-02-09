package SmartKitchen;

public class Refregerator {

    private boolean placeOrder;

    public void setPlaceOrder(boolean placeOrder) {
        this.placeOrder = placeOrder;
        orderingFood();
    }

    public void orderingFood()
    {
        System.out.println("I store food");
    }

}
