package AbstractDemo1;

abstract public class Bike {
//    constructor

    public Bike() {
        System.out.println("Constructor of the abstract class");
    }

//    abstract menthod

    abstract void run();

//    concreate methods
    void shiftGear()
    {
        System.out.println("Shifting the gear............");
    }
}

class Honda extends Bike
{
    @Override
    void run() {
        System.out.println("Bike running safely.......");
    }
}

class AbstractDemo
{

    public static void main(String[] args) {
        Bike object1=new Honda();
        object1.run();
        object1.shiftGear();
    }


}