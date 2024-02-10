import static java.lang.Thread.currentThread;
import static java.lang.Thread.sleep;

public class Entry {
    public static void main(String[] args) {
        MyThread myThread=new MyThread();
        myThread.start();
        MyThread myThread1=new MyThread();
        myThread1.start();
        myThread1.getPriority();
        System.out.println("Main thread");
    }
}
