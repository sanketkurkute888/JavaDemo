public class Bird implements FlightEnabled{
    private String name;

    public Bird(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                '}';
    }


    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }

    @Override
    public void land() {
        System.out.println("Bird is landing");
    }

    @Override
    public void takeOff() {
        System.out.println("Bird is taking off");
    }
}
