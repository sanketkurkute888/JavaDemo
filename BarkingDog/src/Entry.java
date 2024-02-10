public class Entry {
    public static void main(String[] args) {
        BarkingDog barking=new BarkingDog();
        if(barking.shouldWakeUp(true,24))
        {
            System.out.println("wake up!!");
        }
        else
        {
            System.out.println("Not wake up");
        }
    }
}
