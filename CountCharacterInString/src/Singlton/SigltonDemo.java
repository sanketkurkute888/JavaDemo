package Singlton;

public class SigltonDemo {

    private static SigltonDemo obj1;

    private SigltonDemo()
    {
    }

    public  static  SigltonDemo getInstance()
    {
        if(obj1==null)
        {
            obj1=new SigltonDemo();
            System.out.println("Object cretated");
        }
        return obj1;
    }

    public void doSomething() {
        System.out.println("Singleton instance is doing something.");
    }
}
