public class Entry {
    public static void main(String[] args) {
        Bird bird = new Bird("Sparrow");
//        bird.takeOff();
//        bird.fly();
//        bird.land();

        Jet jet = new Jet();
//        jet.takeOff();
//        jet.fly();
//        jet.land();

        flightEnabledFunctions(bird);
        flightEnabledFunctions(jet);
    }

    public static void flightEnabledFunctions(FlightEnabled obj){
        obj.takeOff();
        obj.fly();
        obj.land();
        FlightEnabled.log();
    }
}
