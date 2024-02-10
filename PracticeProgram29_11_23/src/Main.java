
public class Main {
    public static void main(String[] args) {
      Truck truck=new Truck("volvo","volovo-101",1997,"petrol",8.112,4.5);
        System.out.println("Truck Model: " + truck.getModel());
        System.out.println("Fuel Efficiency: " + truck.calculateFuelEfficiency() + " mpg");
        System.out.println("Distance Traveled: " + truck.calculateDistanceTraveled() + " miles");
        System.out.println("Max Speed: " + truck.getMaxSpeed() + " mph\n");
    }
}


