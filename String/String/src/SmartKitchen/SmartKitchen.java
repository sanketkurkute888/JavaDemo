package SmartKitchen;

public class SmartKitchen {
    private CoffeeMaker coffeeMaker;
    private Refregerator refregerator;
    private Washer washer;

    public SmartKitchen() {
        this.coffeeMaker = new CoffeeMaker();
        this.refregerator = new Refregerator();
        this.washer = new Washer();
    }

    public void doKitchenStuff(boolean coffeeflag,boolean orderflag,boolean dishwasherflag)
    {
        if (!coffeeflag && !orderflag && !dishwasherflag) {
            System.out.println("Please Place your order!!!");
        }
        if(coffeeflag)
        {
            coffeeMaker.setMakeCoffee(coffeeflag);
            System.out.println("Your coffee is ready");
        }
        if(orderflag)
        {
            refregerator.setPlaceOrder(orderflag);
            System.out.println("Your food is ready");
        }
        if(dishwasherflag)
        {
            washer.setDoDishes(dishwasherflag);
            System.out.println("Done washing dishes");
        }
        System.out.println("Thank-You");
    }
}

