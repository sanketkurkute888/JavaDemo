package SmartKitchen;

 public class CoffeeMaker {

     private boolean makeCoffee;

     public void setMakeCoffee(boolean makeCoffee) {
         this.makeCoffee = makeCoffee;
         hasToMakeCoffee();
     }




     public void hasToMakeCoffee()
    {
        System.out.println("Coffee making process start");

    }

}
