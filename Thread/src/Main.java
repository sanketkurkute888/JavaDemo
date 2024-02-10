// Online C compiler to run C program online

class Process1 implements Runnable {

    @Override
    public void run() {
        for(int i=0;i<10;i++)
        {
            System.out.println("Process1");
        }
    }
}
class Process2 implements Runnable {

    @Override
    public void run() {
        for(int i=0;i<10;i++)
        {
            System.out.println("Process2");
        }
    }
}


public class Main {
    public static void main(String[] args) {
        Process1 p1 = new Process1();
        Process2 p2 = new Process2();
        Thread t1 = new Thread(p1);
        t1.start();
        Thread t2 = new Thread(p2);
        t2.start();
    }
}