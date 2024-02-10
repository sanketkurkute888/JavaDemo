public class Jet implements FlightEnabled{
    @Override
    public void fly() {
        System.out.println("Jet is flying");
    }

    @Override
    public void land() {
        System.out.println("Jet is landing");
    }

    @Override
    public void takeOff() {
        System.out.println("Jet is taking off");
    }

    @Override
    public void trackData() {
        FlightEnabled.super.trackData();
    }
}
